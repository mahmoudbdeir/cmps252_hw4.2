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

@Tag("34")
class Record_227 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 227: FirstName is Dennis")
	void FirstNameOfRecord227() {
		assertEquals("Dennis", customers.get(226).getFirstName());
	}

	@Test
	@DisplayName("Record 227: LastName is Pocchia")
	void LastNameOfRecord227() {
		assertEquals("Pocchia", customers.get(226).getLastName());
	}

	@Test
	@DisplayName("Record 227: Company is Family Pharmacy Of Hampstead")
	void CompanyOfRecord227() {
		assertEquals("Family Pharmacy Of Hampstead", customers.get(226).getCompany());
	}

	@Test
	@DisplayName("Record 227: Address is 757 Warehouse Rd")
	void AddressOfRecord227() {
		assertEquals("757 Warehouse Rd", customers.get(226).getAddress());
	}

	@Test
	@DisplayName("Record 227: City is Toledo")
	void CityOfRecord227() {
		assertEquals("Toledo", customers.get(226).getCity());
	}

	@Test
	@DisplayName("Record 227: County is Lucas")
	void CountyOfRecord227() {
		assertEquals("Lucas", customers.get(226).getCounty());
	}

	@Test
	@DisplayName("Record 227: State is OH")
	void StateOfRecord227() {
		assertEquals("OH", customers.get(226).getState());
	}

	@Test
	@DisplayName("Record 227: ZIP is 43615")
	void ZIPOfRecord227() {
		assertEquals("43615", customers.get(226).getZIP());
	}

	@Test
	@DisplayName("Record 227: Phone is 419-382-4821")
	void PhoneOfRecord227() {
		assertEquals("419-382-4821", customers.get(226).getPhone());
	}

	@Test
	@DisplayName("Record 227: Fax is 419-382-4644")
	void FaxOfRecord227() {
		assertEquals("419-382-4644", customers.get(226).getFax());
	}

	@Test
	@DisplayName("Record 227: Email is dennis@pocchia.com")
	void EmailOfRecord227() {
		assertEquals("dennis@pocchia.com", customers.get(226).getEmail());
	}

	@Test
	@DisplayName("Record 227: Web is http://www.dennispocchia.com")
	void WebOfRecord227() {
		assertEquals("http://www.dennispocchia.com", customers.get(226).getWeb());
	}
}
