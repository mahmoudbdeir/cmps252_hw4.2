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

@Tag("16")
class Record_300 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 300: FirstName is Amie")
	void FirstNameOfRecord300() {
		assertEquals("Amie", customers.get(299).getFirstName());
	}

	@Test
	@DisplayName("Record 300: LastName is Grammatica")
	void LastNameOfRecord300() {
		assertEquals("Grammatica", customers.get(299).getLastName());
	}

	@Test
	@DisplayName("Record 300: Company is Medi Serv Credit Union")
	void CompanyOfRecord300() {
		assertEquals("Medi Serv Credit Union", customers.get(299).getCompany());
	}

	@Test
	@DisplayName("Record 300: Address is 2750 Hill Ave")
	void AddressOfRecord300() {
		assertEquals("2750 Hill Ave", customers.get(299).getAddress());
	}

	@Test
	@DisplayName("Record 300: City is Toledo")
	void CityOfRecord300() {
		assertEquals("Toledo", customers.get(299).getCity());
	}

	@Test
	@DisplayName("Record 300: County is Lucas")
	void CountyOfRecord300() {
		assertEquals("Lucas", customers.get(299).getCounty());
	}

	@Test
	@DisplayName("Record 300: State is OH")
	void StateOfRecord300() {
		assertEquals("OH", customers.get(299).getState());
	}

	@Test
	@DisplayName("Record 300: ZIP is 43607")
	void ZIPOfRecord300() {
		assertEquals("43607", customers.get(299).getZIP());
	}

	@Test
	@DisplayName("Record 300: Phone is 419-537-0688")
	void PhoneOfRecord300() {
		assertEquals("419-537-0688", customers.get(299).getPhone());
	}

	@Test
	@DisplayName("Record 300: Fax is 419-537-7508")
	void FaxOfRecord300() {
		assertEquals("419-537-7508", customers.get(299).getFax());
	}

	@Test
	@DisplayName("Record 300: Email is amie@grammatica.com")
	void EmailOfRecord300() {
		assertEquals("amie@grammatica.com", customers.get(299).getEmail());
	}

	@Test
	@DisplayName("Record 300: Web is http://www.amiegrammatica.com")
	void WebOfRecord300() {
		assertEquals("http://www.amiegrammatica.com", customers.get(299).getWeb());
	}
}
