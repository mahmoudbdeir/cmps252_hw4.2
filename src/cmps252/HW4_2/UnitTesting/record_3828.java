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

@Tag("9")
class Record_3828 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3828: FirstName is Samantha")
	void FirstNameOfRecord3828() {
		assertEquals("Samantha", customers.get(3827).getFirstName());
	}

	@Test
	@DisplayName("Record 3828: LastName is Swim")
	void LastNameOfRecord3828() {
		assertEquals("Swim", customers.get(3827).getLastName());
	}

	@Test
	@DisplayName("Record 3828: Company is Nelson, William J Jr")
	void CompanyOfRecord3828() {
		assertEquals("Nelson, William J Jr", customers.get(3827).getCompany());
	}

	@Test
	@DisplayName("Record 3828: Address is 46385 Continental Dr")
	void AddressOfRecord3828() {
		assertEquals("46385 Continental Dr", customers.get(3827).getAddress());
	}

	@Test
	@DisplayName("Record 3828: City is New Baltimore")
	void CityOfRecord3828() {
		assertEquals("New Baltimore", customers.get(3827).getCity());
	}

	@Test
	@DisplayName("Record 3828: County is Macomb")
	void CountyOfRecord3828() {
		assertEquals("Macomb", customers.get(3827).getCounty());
	}

	@Test
	@DisplayName("Record 3828: State is MI")
	void StateOfRecord3828() {
		assertEquals("MI", customers.get(3827).getState());
	}

	@Test
	@DisplayName("Record 3828: ZIP is 48047")
	void ZIPOfRecord3828() {
		assertEquals("48047", customers.get(3827).getZIP());
	}

	@Test
	@DisplayName("Record 3828: Phone is 586-949-3320")
	void PhoneOfRecord3828() {
		assertEquals("586-949-3320", customers.get(3827).getPhone());
	}

	@Test
	@DisplayName("Record 3828: Fax is 586-949-0267")
	void FaxOfRecord3828() {
		assertEquals("586-949-0267", customers.get(3827).getFax());
	}

	@Test
	@DisplayName("Record 3828: Email is samantha@swim.com")
	void EmailOfRecord3828() {
		assertEquals("samantha@swim.com", customers.get(3827).getEmail());
	}

	@Test
	@DisplayName("Record 3828: Web is http://www.samanthaswim.com")
	void WebOfRecord3828() {
		assertEquals("http://www.samanthaswim.com", customers.get(3827).getWeb());
	}
}
