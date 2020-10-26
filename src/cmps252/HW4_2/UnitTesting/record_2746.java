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

@Tag("15")
class Record_2746 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2746: FirstName is Loretta")
	void FirstNameOfRecord2746() {
		assertEquals("Loretta", customers.get(2745).getFirstName());
	}

	@Test
	@DisplayName("Record 2746: LastName is Keville")
	void LastNameOfRecord2746() {
		assertEquals("Keville", customers.get(2745).getLastName());
	}

	@Test
	@DisplayName("Record 2746: Company is Rollison Oil Co")
	void CompanyOfRecord2746() {
		assertEquals("Rollison Oil Co", customers.get(2745).getCompany());
	}

	@Test
	@DisplayName("Record 2746: Address is 1 Choptank Rd")
	void AddressOfRecord2746() {
		assertEquals("1 Choptank Rd", customers.get(2745).getAddress());
	}

	@Test
	@DisplayName("Record 2746: City is Preston")
	void CityOfRecord2746() {
		assertEquals("Preston", customers.get(2745).getCity());
	}

	@Test
	@DisplayName("Record 2746: County is Caroline")
	void CountyOfRecord2746() {
		assertEquals("Caroline", customers.get(2745).getCounty());
	}

	@Test
	@DisplayName("Record 2746: State is MD")
	void StateOfRecord2746() {
		assertEquals("MD", customers.get(2745).getState());
	}

	@Test
	@DisplayName("Record 2746: ZIP is 21655")
	void ZIPOfRecord2746() {
		assertEquals("21655", customers.get(2745).getZIP());
	}

	@Test
	@DisplayName("Record 2746: Phone is 410-673-0919")
	void PhoneOfRecord2746() {
		assertEquals("410-673-0919", customers.get(2745).getPhone());
	}

	@Test
	@DisplayName("Record 2746: Fax is 410-673-5064")
	void FaxOfRecord2746() {
		assertEquals("410-673-5064", customers.get(2745).getFax());
	}

	@Test
	@DisplayName("Record 2746: Email is loretta@keville.com")
	void EmailOfRecord2746() {
		assertEquals("loretta@keville.com", customers.get(2745).getEmail());
	}

	@Test
	@DisplayName("Record 2746: Web is http://www.lorettakeville.com")
	void WebOfRecord2746() {
		assertEquals("http://www.lorettakeville.com", customers.get(2745).getWeb());
	}
}
