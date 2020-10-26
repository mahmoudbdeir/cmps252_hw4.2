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

@Tag("1")
class Record_1484 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1484: FirstName is Buddy")
	void FirstNameOfRecord1484() {
		assertEquals("Buddy", customers.get(1483).getFirstName());
	}

	@Test
	@DisplayName("Record 1484: LastName is Bietsch")
	void LastNameOfRecord1484() {
		assertEquals("Bietsch", customers.get(1483).getLastName());
	}

	@Test
	@DisplayName("Record 1484: Company is Columbus Carbon & Stnls Inc")
	void CompanyOfRecord1484() {
		assertEquals("Columbus Carbon & Stnls Inc", customers.get(1483).getCompany());
	}

	@Test
	@DisplayName("Record 1484: Address is Box #-400")
	void AddressOfRecord1484() {
		assertEquals("Box #-400", customers.get(1483).getAddress());
	}

	@Test
	@DisplayName("Record 1484: City is Dodge City")
	void CityOfRecord1484() {
		assertEquals("Dodge City", customers.get(1483).getCity());
	}

	@Test
	@DisplayName("Record 1484: County is Ford")
	void CountyOfRecord1484() {
		assertEquals("Ford", customers.get(1483).getCounty());
	}

	@Test
	@DisplayName("Record 1484: State is KS")
	void StateOfRecord1484() {
		assertEquals("KS", customers.get(1483).getState());
	}

	@Test
	@DisplayName("Record 1484: ZIP is 67801")
	void ZIPOfRecord1484() {
		assertEquals("67801", customers.get(1483).getZIP());
	}

	@Test
	@DisplayName("Record 1484: Phone is 620-225-9526")
	void PhoneOfRecord1484() {
		assertEquals("620-225-9526", customers.get(1483).getPhone());
	}

	@Test
	@DisplayName("Record 1484: Fax is 620-225-6137")
	void FaxOfRecord1484() {
		assertEquals("620-225-6137", customers.get(1483).getFax());
	}

	@Test
	@DisplayName("Record 1484: Email is buddy@bietsch.com")
	void EmailOfRecord1484() {
		assertEquals("buddy@bietsch.com", customers.get(1483).getEmail());
	}

	@Test
	@DisplayName("Record 1484: Web is http://www.buddybietsch.com")
	void WebOfRecord1484() {
		assertEquals("http://www.buddybietsch.com", customers.get(1483).getWeb());
	}
}
