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
class Record_4024 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4024: FirstName is Elena")
	void FirstNameOfRecord4024() {
		assertEquals("Elena", customers.get(4023).getFirstName());
	}

	@Test
	@DisplayName("Record 4024: LastName is Greenrose")
	void LastNameOfRecord4024() {
		assertEquals("Greenrose", customers.get(4023).getLastName());
	}

	@Test
	@DisplayName("Record 4024: Company is Maytag International")
	void CompanyOfRecord4024() {
		assertEquals("Maytag International", customers.get(4023).getCompany());
	}

	@Test
	@DisplayName("Record 4024: Address is 2801 N 6th St")
	void AddressOfRecord4024() {
		assertEquals("2801 N 6th St", customers.get(4023).getAddress());
	}

	@Test
	@DisplayName("Record 4024: City is Abilene")
	void CityOfRecord4024() {
		assertEquals("Abilene", customers.get(4023).getCity());
	}

	@Test
	@DisplayName("Record 4024: County is Taylor")
	void CountyOfRecord4024() {
		assertEquals("Taylor", customers.get(4023).getCounty());
	}

	@Test
	@DisplayName("Record 4024: State is TX")
	void StateOfRecord4024() {
		assertEquals("TX", customers.get(4023).getState());
	}

	@Test
	@DisplayName("Record 4024: ZIP is 79603")
	void ZIPOfRecord4024() {
		assertEquals("79603", customers.get(4023).getZIP());
	}

	@Test
	@DisplayName("Record 4024: Phone is 325-676-2530")
	void PhoneOfRecord4024() {
		assertEquals("325-676-2530", customers.get(4023).getPhone());
	}

	@Test
	@DisplayName("Record 4024: Fax is 325-676-7677")
	void FaxOfRecord4024() {
		assertEquals("325-676-7677", customers.get(4023).getFax());
	}

	@Test
	@DisplayName("Record 4024: Email is elena@greenrose.com")
	void EmailOfRecord4024() {
		assertEquals("elena@greenrose.com", customers.get(4023).getEmail());
	}

	@Test
	@DisplayName("Record 4024: Web is http://www.elenagreenrose.com")
	void WebOfRecord4024() {
		assertEquals("http://www.elenagreenrose.com", customers.get(4023).getWeb());
	}
}
