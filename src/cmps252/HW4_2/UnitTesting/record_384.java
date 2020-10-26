package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("26")
class Record_384 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 384: FirstName is Phyllis")
	void FirstNameOfRecord384() {
		assertEquals("Phyllis", customers.get(383).getFirstName());
	}

	@Test
	@DisplayName("Record 384: LastName is Schmerer")
	void LastNameOfRecord384() {
		assertEquals("Schmerer", customers.get(383).getLastName());
	}

	@Test
	@DisplayName("Record 384: Company is Simon, Debbie")
	void CompanyOfRecord384() {
		assertEquals("Simon, Debbie", customers.get(383).getCompany());
	}

	@Test
	@DisplayName("Record 384: Address is 299 Market St")
	void AddressOfRecord384() {
		assertEquals("299 Market St", customers.get(383).getAddress());
	}

	@Test
	@DisplayName("Record 384: City is Saddle Brook")
	void CityOfRecord384() {
		assertEquals("Saddle Brook", customers.get(383).getCity());
	}

	@Test
	@DisplayName("Record 384: County is Bergen")
	void CountyOfRecord384() {
		assertEquals("Bergen", customers.get(383).getCounty());
	}

	@Test
	@DisplayName("Record 384: State is NJ")
	void StateOfRecord384() {
		assertEquals("NJ", customers.get(383).getState());
	}

	@Test
	@DisplayName("Record 384: ZIP is 7663")
	void ZIPOfRecord384() {
		assertEquals("7663", customers.get(383).getZIP());
	}

	@Test
	@DisplayName("Record 384: Phone is 201-843-9959")
	void PhoneOfRecord384() {
		assertEquals("201-843-9959", customers.get(383).getPhone());
	}

	@Test
	@DisplayName("Record 384: Fax is 201-843-7695")
	void FaxOfRecord384() {
		assertEquals("201-843-7695", customers.get(383).getFax());
	}

	@Test
	@DisplayName("Record 384: Email is phyllis@schmerer.com")
	void EmailOfRecord384() {
		assertEquals("phyllis@schmerer.com", customers.get(383).getEmail());
	}

	@Test
	@DisplayName("Record 384: Web is http://www.phyllisschmerer.com")
	void WebOfRecord384() {
		assertEquals("http://www.phyllisschmerer.com", customers.get(383).getWeb());
	}
}
