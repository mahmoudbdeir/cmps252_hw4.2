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

@Tag("27")
class Record_1716 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1716: FirstName is Rex")
	void FirstNameOfRecord1716() {
		assertEquals("Rex", customers.get(1715).getFirstName());
	}

	@Test
	@DisplayName("Record 1716: LastName is Girvin")
	void LastNameOfRecord1716() {
		assertEquals("Girvin", customers.get(1715).getLastName());
	}

	@Test
	@DisplayName("Record 1716: Company is Glenn W Monigle & Assoc Inc")
	void CompanyOfRecord1716() {
		assertEquals("Glenn W Monigle & Assoc Inc", customers.get(1715).getCompany());
	}

	@Test
	@DisplayName("Record 1716: Address is 400 Kelby")
	void AddressOfRecord1716() {
		assertEquals("400 Kelby", customers.get(1715).getAddress());
	}

	@Test
	@DisplayName("Record 1716: City is Fort Lee")
	void CityOfRecord1716() {
		assertEquals("Fort Lee", customers.get(1715).getCity());
	}

	@Test
	@DisplayName("Record 1716: County is Bergen")
	void CountyOfRecord1716() {
		assertEquals("Bergen", customers.get(1715).getCounty());
	}

	@Test
	@DisplayName("Record 1716: State is NJ")
	void StateOfRecord1716() {
		assertEquals("NJ", customers.get(1715).getState());
	}

	@Test
	@DisplayName("Record 1716: ZIP is 7024")
	void ZIPOfRecord1716() {
		assertEquals("7024", customers.get(1715).getZIP());
	}

	@Test
	@DisplayName("Record 1716: Phone is 201-461-0578")
	void PhoneOfRecord1716() {
		assertEquals("201-461-0578", customers.get(1715).getPhone());
	}

	@Test
	@DisplayName("Record 1716: Fax is 201-461-9776")
	void FaxOfRecord1716() {
		assertEquals("201-461-9776", customers.get(1715).getFax());
	}

	@Test
	@DisplayName("Record 1716: Email is rex@girvin.com")
	void EmailOfRecord1716() {
		assertEquals("rex@girvin.com", customers.get(1715).getEmail());
	}

	@Test
	@DisplayName("Record 1716: Web is http://www.rexgirvin.com")
	void WebOfRecord1716() {
		assertEquals("http://www.rexgirvin.com", customers.get(1715).getWeb());
	}
}
