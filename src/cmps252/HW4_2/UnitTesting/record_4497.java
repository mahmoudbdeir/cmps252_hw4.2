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

@Tag("8")
class Record_4497 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4497: FirstName is Arden")
	void FirstNameOfRecord4497() {
		assertEquals("Arden", customers.get(4496).getFirstName());
	}

	@Test
	@DisplayName("Record 4497: LastName is Mawson")
	void LastNameOfRecord4497() {
		assertEquals("Mawson", customers.get(4496).getLastName());
	}

	@Test
	@DisplayName("Record 4497: Company is Insty Prints Printing Centers")
	void CompanyOfRecord4497() {
		assertEquals("Insty Prints Printing Centers", customers.get(4496).getCompany());
	}

	@Test
	@DisplayName("Record 4497: Address is 265 Main St")
	void AddressOfRecord4497() {
		assertEquals("265 Main St", customers.get(4496).getAddress());
	}

	@Test
	@DisplayName("Record 4497: City is Goshen")
	void CityOfRecord4497() {
		assertEquals("Goshen", customers.get(4496).getCity());
	}

	@Test
	@DisplayName("Record 4497: County is Orange")
	void CountyOfRecord4497() {
		assertEquals("Orange", customers.get(4496).getCounty());
	}

	@Test
	@DisplayName("Record 4497: State is NY")
	void StateOfRecord4497() {
		assertEquals("NY", customers.get(4496).getState());
	}

	@Test
	@DisplayName("Record 4497: ZIP is 10924")
	void ZIPOfRecord4497() {
		assertEquals("10924", customers.get(4496).getZIP());
	}

	@Test
	@DisplayName("Record 4497: Phone is 845-294-6578")
	void PhoneOfRecord4497() {
		assertEquals("845-294-6578", customers.get(4496).getPhone());
	}

	@Test
	@DisplayName("Record 4497: Fax is 845-294-7047")
	void FaxOfRecord4497() {
		assertEquals("845-294-7047", customers.get(4496).getFax());
	}

	@Test
	@DisplayName("Record 4497: Email is arden@mawson.com")
	void EmailOfRecord4497() {
		assertEquals("arden@mawson.com", customers.get(4496).getEmail());
	}

	@Test
	@DisplayName("Record 4497: Web is http://www.ardenmawson.com")
	void WebOfRecord4497() {
		assertEquals("http://www.ardenmawson.com", customers.get(4496).getWeb());
	}
}
