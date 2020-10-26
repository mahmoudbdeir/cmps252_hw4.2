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

@Tag("22")
class Record_3934 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3934: FirstName is Karla")
	void FirstNameOfRecord3934() {
		assertEquals("Karla", customers.get(3933).getFirstName());
	}

	@Test
	@DisplayName("Record 3934: LastName is Glancy")
	void LastNameOfRecord3934() {
		assertEquals("Glancy", customers.get(3933).getLastName());
	}

	@Test
	@DisplayName("Record 3934: Company is Lee, Tony S Esq")
	void CompanyOfRecord3934() {
		assertEquals("Lee, Tony S Esq", customers.get(3933).getCompany());
	}

	@Test
	@DisplayName("Record 3934: Address is 21 Central Grand Ave")
	void AddressOfRecord3934() {
		assertEquals("21 Central Grand Ave", customers.get(3933).getAddress());
	}

	@Test
	@DisplayName("Record 3934: City is Wallingford")
	void CityOfRecord3934() {
		assertEquals("Wallingford", customers.get(3933).getCity());
	}

	@Test
	@DisplayName("Record 3934: County is New Haven")
	void CountyOfRecord3934() {
		assertEquals("New Haven", customers.get(3933).getCounty());
	}

	@Test
	@DisplayName("Record 3934: State is CT")
	void StateOfRecord3934() {
		assertEquals("CT", customers.get(3933).getState());
	}

	@Test
	@DisplayName("Record 3934: ZIP is 6492")
	void ZIPOfRecord3934() {
		assertEquals("6492", customers.get(3933).getZIP());
	}

	@Test
	@DisplayName("Record 3934: Phone is 203-284-8113")
	void PhoneOfRecord3934() {
		assertEquals("203-284-8113", customers.get(3933).getPhone());
	}

	@Test
	@DisplayName("Record 3934: Fax is 203-284-5899")
	void FaxOfRecord3934() {
		assertEquals("203-284-5899", customers.get(3933).getFax());
	}

	@Test
	@DisplayName("Record 3934: Email is karla@glancy.com")
	void EmailOfRecord3934() {
		assertEquals("karla@glancy.com", customers.get(3933).getEmail());
	}

	@Test
	@DisplayName("Record 3934: Web is http://www.karlaglancy.com")
	void WebOfRecord3934() {
		assertEquals("http://www.karlaglancy.com", customers.get(3933).getWeb());
	}
}
