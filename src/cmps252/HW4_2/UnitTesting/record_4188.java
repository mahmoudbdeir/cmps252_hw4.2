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

@Tag("14")
class Record_4188 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4188: FirstName is Nellie")
	void FirstNameOfRecord4188() {
		assertEquals("Nellie", customers.get(4187).getFirstName());
	}

	@Test
	@DisplayName("Record 4188: LastName is Goyal")
	void LastNameOfRecord4188() {
		assertEquals("Goyal", customers.get(4187).getLastName());
	}

	@Test
	@DisplayName("Record 4188: Company is Hoag, Hallack W Esq")
	void CompanyOfRecord4188() {
		assertEquals("Hoag, Hallack W Esq", customers.get(4187).getCompany());
	}

	@Test
	@DisplayName("Record 4188: Address is 5900 Hubbard Dr")
	void AddressOfRecord4188() {
		assertEquals("5900 Hubbard Dr", customers.get(4187).getAddress());
	}

	@Test
	@DisplayName("Record 4188: City is Rockville")
	void CityOfRecord4188() {
		assertEquals("Rockville", customers.get(4187).getCity());
	}

	@Test
	@DisplayName("Record 4188: County is Montgomery")
	void CountyOfRecord4188() {
		assertEquals("Montgomery", customers.get(4187).getCounty());
	}

	@Test
	@DisplayName("Record 4188: State is MD")
	void StateOfRecord4188() {
		assertEquals("MD", customers.get(4187).getState());
	}

	@Test
	@DisplayName("Record 4188: ZIP is 20852")
	void ZIPOfRecord4188() {
		assertEquals("20852", customers.get(4187).getZIP());
	}

	@Test
	@DisplayName("Record 4188: Phone is 301-881-8618")
	void PhoneOfRecord4188() {
		assertEquals("301-881-8618", customers.get(4187).getPhone());
	}

	@Test
	@DisplayName("Record 4188: Fax is 301-881-7066")
	void FaxOfRecord4188() {
		assertEquals("301-881-7066", customers.get(4187).getFax());
	}

	@Test
	@DisplayName("Record 4188: Email is nellie@goyal.com")
	void EmailOfRecord4188() {
		assertEquals("nellie@goyal.com", customers.get(4187).getEmail());
	}

	@Test
	@DisplayName("Record 4188: Web is http://www.nelliegoyal.com")
	void WebOfRecord4188() {
		assertEquals("http://www.nelliegoyal.com", customers.get(4187).getWeb());
	}
}
