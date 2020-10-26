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

@Tag("41")
class Record_3854 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3854: FirstName is Randi")
	void FirstNameOfRecord3854() {
		assertEquals("Randi", customers.get(3853).getFirstName());
	}

	@Test
	@DisplayName("Record 3854: LastName is Woolston")
	void LastNameOfRecord3854() {
		assertEquals("Woolston", customers.get(3853).getLastName());
	}

	@Test
	@DisplayName("Record 3854: Company is Hernandez, Carl Iii")
	void CompanyOfRecord3854() {
		assertEquals("Hernandez, Carl Iii", customers.get(3853).getCompany());
	}

	@Test
	@DisplayName("Record 3854: Address is 2733 E Manoa Rd  #-205")
	void AddressOfRecord3854() {
		assertEquals("2733 E Manoa Rd  #-205", customers.get(3853).getAddress());
	}

	@Test
	@DisplayName("Record 3854: City is Honolulu")
	void CityOfRecord3854() {
		assertEquals("Honolulu", customers.get(3853).getCity());
	}

	@Test
	@DisplayName("Record 3854: County is Honolulu")
	void CountyOfRecord3854() {
		assertEquals("Honolulu", customers.get(3853).getCounty());
	}

	@Test
	@DisplayName("Record 3854: State is HI")
	void StateOfRecord3854() {
		assertEquals("HI", customers.get(3853).getState());
	}

	@Test
	@DisplayName("Record 3854: ZIP is 96822")
	void ZIPOfRecord3854() {
		assertEquals("96822", customers.get(3853).getZIP());
	}

	@Test
	@DisplayName("Record 3854: Phone is 808-949-3122")
	void PhoneOfRecord3854() {
		assertEquals("808-949-3122", customers.get(3853).getPhone());
	}

	@Test
	@DisplayName("Record 3854: Fax is 808-949-1595")
	void FaxOfRecord3854() {
		assertEquals("808-949-1595", customers.get(3853).getFax());
	}

	@Test
	@DisplayName("Record 3854: Email is randi@woolston.com")
	void EmailOfRecord3854() {
		assertEquals("randi@woolston.com", customers.get(3853).getEmail());
	}

	@Test
	@DisplayName("Record 3854: Web is http://www.randiwoolston.com")
	void WebOfRecord3854() {
		assertEquals("http://www.randiwoolston.com", customers.get(3853).getWeb());
	}
}
