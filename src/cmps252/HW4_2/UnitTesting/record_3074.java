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

@Tag("35")
class Record_3074 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3074: FirstName is Elva")
	void FirstNameOfRecord3074() {
		assertEquals("Elva", customers.get(3073).getFirstName());
	}

	@Test
	@DisplayName("Record 3074: LastName is Maddaleno")
	void LastNameOfRecord3074() {
		assertEquals("Maddaleno", customers.get(3073).getLastName());
	}

	@Test
	@DisplayName("Record 3074: Company is Rounds Custom Photo Lab Inc")
	void CompanyOfRecord3074() {
		assertEquals("Rounds Custom Photo Lab Inc", customers.get(3073).getCompany());
	}

	@Test
	@DisplayName("Record 3074: Address is 15601 Old Us Highway 441")
	void AddressOfRecord3074() {
		assertEquals("15601 Old Us Highway 441", customers.get(3073).getAddress());
	}

	@Test
	@DisplayName("Record 3074: City is Tavares")
	void CityOfRecord3074() {
		assertEquals("Tavares", customers.get(3073).getCity());
	}

	@Test
	@DisplayName("Record 3074: County is Lake")
	void CountyOfRecord3074() {
		assertEquals("Lake", customers.get(3073).getCounty());
	}

	@Test
	@DisplayName("Record 3074: State is FL")
	void StateOfRecord3074() {
		assertEquals("FL", customers.get(3073).getState());
	}

	@Test
	@DisplayName("Record 3074: ZIP is 32778")
	void ZIPOfRecord3074() {
		assertEquals("32778", customers.get(3073).getZIP());
	}

	@Test
	@DisplayName("Record 3074: Phone is 352-343-3524")
	void PhoneOfRecord3074() {
		assertEquals("352-343-3524", customers.get(3073).getPhone());
	}

	@Test
	@DisplayName("Record 3074: Fax is 352-343-7541")
	void FaxOfRecord3074() {
		assertEquals("352-343-7541", customers.get(3073).getFax());
	}

	@Test
	@DisplayName("Record 3074: Email is elva@maddaleno.com")
	void EmailOfRecord3074() {
		assertEquals("elva@maddaleno.com", customers.get(3073).getEmail());
	}

	@Test
	@DisplayName("Record 3074: Web is http://www.elvamaddaleno.com")
	void WebOfRecord3074() {
		assertEquals("http://www.elvamaddaleno.com", customers.get(3073).getWeb());
	}
}
