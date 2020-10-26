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

@Tag("1")
class Record_4255 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4255: FirstName is Cynthia")
	void FirstNameOfRecord4255() {
		assertEquals("Cynthia", customers.get(4254).getFirstName());
	}

	@Test
	@DisplayName("Record 4255: LastName is Schiro")
	void LastNameOfRecord4255() {
		assertEquals("Schiro", customers.get(4254).getLastName());
	}

	@Test
	@DisplayName("Record 4255: Company is Morganite Inc Carbon Brushes")
	void CompanyOfRecord4255() {
		assertEquals("Morganite Inc Carbon Brushes", customers.get(4254).getCompany());
	}

	@Test
	@DisplayName("Record 4255: Address is 1818 Market St  #-35")
	void AddressOfRecord4255() {
		assertEquals("1818 Market St  #-35", customers.get(4254).getAddress());
	}

	@Test
	@DisplayName("Record 4255: City is Philadelphia")
	void CityOfRecord4255() {
		assertEquals("Philadelphia", customers.get(4254).getCity());
	}

	@Test
	@DisplayName("Record 4255: County is Philadelphia")
	void CountyOfRecord4255() {
		assertEquals("Philadelphia", customers.get(4254).getCounty());
	}

	@Test
	@DisplayName("Record 4255: State is PA")
	void StateOfRecord4255() {
		assertEquals("PA", customers.get(4254).getState());
	}

	@Test
	@DisplayName("Record 4255: ZIP is 19103")
	void ZIPOfRecord4255() {
		assertEquals("19103", customers.get(4254).getZIP());
	}

	@Test
	@DisplayName("Record 4255: Phone is 215-569-4863")
	void PhoneOfRecord4255() {
		assertEquals("215-569-4863", customers.get(4254).getPhone());
	}

	@Test
	@DisplayName("Record 4255: Fax is 215-569-9246")
	void FaxOfRecord4255() {
		assertEquals("215-569-9246", customers.get(4254).getFax());
	}

	@Test
	@DisplayName("Record 4255: Email is cynthia@schiro.com")
	void EmailOfRecord4255() {
		assertEquals("cynthia@schiro.com", customers.get(4254).getEmail());
	}

	@Test
	@DisplayName("Record 4255: Web is http://www.cynthiaschiro.com")
	void WebOfRecord4255() {
		assertEquals("http://www.cynthiaschiro.com", customers.get(4254).getWeb());
	}
}
