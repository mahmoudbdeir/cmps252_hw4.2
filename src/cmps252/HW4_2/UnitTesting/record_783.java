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

@Tag("30")
class Record_783 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 783: FirstName is Ivory")
	void FirstNameOfRecord783() {
		assertEquals("Ivory", customers.get(782).getFirstName());
	}

	@Test
	@DisplayName("Record 783: LastName is Mansour")
	void LastNameOfRecord783() {
		assertEquals("Mansour", customers.get(782).getLastName());
	}

	@Test
	@DisplayName("Record 783: Company is Village Inn Motel")
	void CompanyOfRecord783() {
		assertEquals("Village Inn Motel", customers.get(782).getCompany());
	}

	@Test
	@DisplayName("Record 783: Address is 125 Lincoln Blvd")
	void AddressOfRecord783() {
		assertEquals("125 Lincoln Blvd", customers.get(782).getAddress());
	}

	@Test
	@DisplayName("Record 783: City is Middlesex")
	void CityOfRecord783() {
		assertEquals("Middlesex", customers.get(782).getCity());
	}

	@Test
	@DisplayName("Record 783: County is Middlesex")
	void CountyOfRecord783() {
		assertEquals("Middlesex", customers.get(782).getCounty());
	}

	@Test
	@DisplayName("Record 783: State is NJ")
	void StateOfRecord783() {
		assertEquals("NJ", customers.get(782).getState());
	}

	@Test
	@DisplayName("Record 783: ZIP is 8846")
	void ZIPOfRecord783() {
		assertEquals("8846", customers.get(782).getZIP());
	}

	@Test
	@DisplayName("Record 783: Phone is 732-805-9017")
	void PhoneOfRecord783() {
		assertEquals("732-805-9017", customers.get(782).getPhone());
	}

	@Test
	@DisplayName("Record 783: Fax is 732-805-8286")
	void FaxOfRecord783() {
		assertEquals("732-805-8286", customers.get(782).getFax());
	}

	@Test
	@DisplayName("Record 783: Email is ivory@mansour.com")
	void EmailOfRecord783() {
		assertEquals("ivory@mansour.com", customers.get(782).getEmail());
	}

	@Test
	@DisplayName("Record 783: Web is http://www.ivorymansour.com")
	void WebOfRecord783() {
		assertEquals("http://www.ivorymansour.com", customers.get(782).getWeb());
	}
}
