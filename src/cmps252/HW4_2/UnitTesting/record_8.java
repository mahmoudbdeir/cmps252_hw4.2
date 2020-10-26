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

@Tag("38")
class Record_8 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 8: FirstName is Lashawn")
	void FirstNameOfRecord8() {
		assertEquals("Lashawn", customers.get(7).getFirstName());
	}

	@Test
	@DisplayName("Record 8: LastName is Mariska")
	void LastNameOfRecord8() {
		assertEquals("Mariska", customers.get(7).getLastName());
	}

	@Test
	@DisplayName("Record 8: Company is Grover, Phillip")
	void CompanyOfRecord8() {
		assertEquals("Grover, Phillip", customers.get(7).getCompany());
	}

	@Test
	@DisplayName("Record 8: Address is 5600 Sw 6th Ave")
	void AddressOfRecord8() {
		assertEquals("5600 Sw 6th Ave", customers.get(7).getAddress());
	}

	@Test
	@DisplayName("Record 8: City is Topeka")
	void CityOfRecord8() {
		assertEquals("Topeka", customers.get(7).getCity());
	}

	@Test
	@DisplayName("Record 8: County is Shawnee")
	void CountyOfRecord8() {
		assertEquals("Shawnee", customers.get(7).getCounty());
	}

	@Test
	@DisplayName("Record 8: State is KS")
	void StateOfRecord8() {
		assertEquals("KS", customers.get(7).getState());
	}

	@Test
	@DisplayName("Record 8: ZIP is 66606")
	void ZIPOfRecord8() {
		assertEquals("66606", customers.get(7).getZIP());
	}

	@Test
	@DisplayName("Record 8: Phone is 785-272-6823")
	void PhoneOfRecord8() {
		assertEquals("785-272-6823", customers.get(7).getPhone());
	}

	@Test
	@DisplayName("Record 8: Fax is 785-272-1019")
	void FaxOfRecord8() {
		assertEquals("785-272-1019", customers.get(7).getFax());
	}

	@Test
	@DisplayName("Record 8: Email is lashawn@mariska.com")
	void EmailOfRecord8() {
		assertEquals("lashawn@mariska.com", customers.get(7).getEmail());
	}

	@Test
	@DisplayName("Record 8: Web is http://www.lashawnmariska.com")
	void WebOfRecord8() {
		assertEquals("http://www.lashawnmariska.com", customers.get(7).getWeb());
	}
}
