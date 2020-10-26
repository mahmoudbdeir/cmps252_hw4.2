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

@Tag("25")
class Record_2407 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2407: FirstName is Marguerite")
	void FirstNameOfRecord2407() {
		assertEquals("Marguerite", customers.get(2406).getFirstName());
	}

	@Test
	@DisplayName("Record 2407: LastName is Schulder")
	void LastNameOfRecord2407() {
		assertEquals("Schulder", customers.get(2406).getLastName());
	}

	@Test
	@DisplayName("Record 2407: Company is Mcwhorter Inc")
	void CompanyOfRecord2407() {
		assertEquals("Mcwhorter Inc", customers.get(2406).getCompany());
	}

	@Test
	@DisplayName("Record 2407: Address is 1 Knikrbkr Ave")
	void AddressOfRecord2407() {
		assertEquals("1 Knikrbkr Ave", customers.get(2406).getAddress());
	}

	@Test
	@DisplayName("Record 2407: City is Brooklyn")
	void CityOfRecord2407() {
		assertEquals("Brooklyn", customers.get(2406).getCity());
	}

	@Test
	@DisplayName("Record 2407: County is Kings")
	void CountyOfRecord2407() {
		assertEquals("Kings", customers.get(2406).getCounty());
	}

	@Test
	@DisplayName("Record 2407: State is NY")
	void StateOfRecord2407() {
		assertEquals("NY", customers.get(2406).getState());
	}

	@Test
	@DisplayName("Record 2407: ZIP is 11237")
	void ZIPOfRecord2407() {
		assertEquals("11237", customers.get(2406).getZIP());
	}

	@Test
	@DisplayName("Record 2407: Phone is 718-456-7704")
	void PhoneOfRecord2407() {
		assertEquals("718-456-7704", customers.get(2406).getPhone());
	}

	@Test
	@DisplayName("Record 2407: Fax is 718-456-5002")
	void FaxOfRecord2407() {
		assertEquals("718-456-5002", customers.get(2406).getFax());
	}

	@Test
	@DisplayName("Record 2407: Email is marguerite@schulder.com")
	void EmailOfRecord2407() {
		assertEquals("marguerite@schulder.com", customers.get(2406).getEmail());
	}

	@Test
	@DisplayName("Record 2407: Web is http://www.margueriteschulder.com")
	void WebOfRecord2407() {
		assertEquals("http://www.margueriteschulder.com", customers.get(2406).getWeb());
	}
}
