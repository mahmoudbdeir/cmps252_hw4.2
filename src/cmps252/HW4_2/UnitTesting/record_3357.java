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

@Tag("29")
class Record_3357 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3357: FirstName is Jan")
	void FirstNameOfRecord3357() {
		assertEquals("Jan", customers.get(3356).getFirstName());
	}

	@Test
	@DisplayName("Record 3357: LastName is Kellebrew")
	void LastNameOfRecord3357() {
		assertEquals("Kellebrew", customers.get(3356).getLastName());
	}

	@Test
	@DisplayName("Record 3357: Company is Grtr Corning Area C Of C")
	void CompanyOfRecord3357() {
		assertEquals("Grtr Corning Area C Of C", customers.get(3356).getCompany());
	}

	@Test
	@DisplayName("Record 3357: Address is 9 Troast Ct")
	void AddressOfRecord3357() {
		assertEquals("9 Troast Ct", customers.get(3356).getAddress());
	}

	@Test
	@DisplayName("Record 3357: City is Clifton")
	void CityOfRecord3357() {
		assertEquals("Clifton", customers.get(3356).getCity());
	}

	@Test
	@DisplayName("Record 3357: County is Passaic")
	void CountyOfRecord3357() {
		assertEquals("Passaic", customers.get(3356).getCounty());
	}

	@Test
	@DisplayName("Record 3357: State is NJ")
	void StateOfRecord3357() {
		assertEquals("NJ", customers.get(3356).getState());
	}

	@Test
	@DisplayName("Record 3357: ZIP is 7011")
	void ZIPOfRecord3357() {
		assertEquals("7011", customers.get(3356).getZIP());
	}

	@Test
	@DisplayName("Record 3357: Phone is 973-772-9918")
	void PhoneOfRecord3357() {
		assertEquals("973-772-9918", customers.get(3356).getPhone());
	}

	@Test
	@DisplayName("Record 3357: Fax is 973-772-6142")
	void FaxOfRecord3357() {
		assertEquals("973-772-6142", customers.get(3356).getFax());
	}

	@Test
	@DisplayName("Record 3357: Email is jan@kellebrew.com")
	void EmailOfRecord3357() {
		assertEquals("jan@kellebrew.com", customers.get(3356).getEmail());
	}

	@Test
	@DisplayName("Record 3357: Web is http://www.jankellebrew.com")
	void WebOfRecord3357() {
		assertEquals("http://www.jankellebrew.com", customers.get(3356).getWeb());
	}
}
