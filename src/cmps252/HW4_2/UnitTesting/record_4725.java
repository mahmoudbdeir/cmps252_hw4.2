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

@Tag("26")
class Record_4725 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4725: FirstName is Rashad")
	void FirstNameOfRecord4725() {
		assertEquals("Rashad", customers.get(4724).getFirstName());
	}

	@Test
	@DisplayName("Record 4725: LastName is Stydinger")
	void LastNameOfRecord4725() {
		assertEquals("Stydinger", customers.get(4724).getLastName());
	}

	@Test
	@DisplayName("Record 4725: Company is Wptt Tv Channel 22")
	void CompanyOfRecord4725() {
		assertEquals("Wptt Tv Channel 22", customers.get(4724).getCompany());
	}

	@Test
	@DisplayName("Record 4725: Address is 2123 Ivy Rd")
	void AddressOfRecord4725() {
		assertEquals("2123 Ivy Rd", customers.get(4724).getAddress());
	}

	@Test
	@DisplayName("Record 4725: City is Charlottesville")
	void CityOfRecord4725() {
		assertEquals("Charlottesville", customers.get(4724).getCity());
	}

	@Test
	@DisplayName("Record 4725: County is Charlottesville City")
	void CountyOfRecord4725() {
		assertEquals("Charlottesville City", customers.get(4724).getCounty());
	}

	@Test
	@DisplayName("Record 4725: State is VA")
	void StateOfRecord4725() {
		assertEquals("VA", customers.get(4724).getState());
	}

	@Test
	@DisplayName("Record 4725: ZIP is 22903")
	void ZIPOfRecord4725() {
		assertEquals("22903", customers.get(4724).getZIP());
	}

	@Test
	@DisplayName("Record 4725: Phone is 434-295-3229")
	void PhoneOfRecord4725() {
		assertEquals("434-295-3229", customers.get(4724).getPhone());
	}

	@Test
	@DisplayName("Record 4725: Fax is 434-295-4194")
	void FaxOfRecord4725() {
		assertEquals("434-295-4194", customers.get(4724).getFax());
	}

	@Test
	@DisplayName("Record 4725: Email is rashad@stydinger.com")
	void EmailOfRecord4725() {
		assertEquals("rashad@stydinger.com", customers.get(4724).getEmail());
	}

	@Test
	@DisplayName("Record 4725: Web is http://www.rashadstydinger.com")
	void WebOfRecord4725() {
		assertEquals("http://www.rashadstydinger.com", customers.get(4724).getWeb());
	}
}
