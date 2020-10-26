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

@Tag("13")
class Record_4739 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4739: FirstName is Dorsey")
	void FirstNameOfRecord4739() {
		assertEquals("Dorsey", customers.get(4738).getFirstName());
	}

	@Test
	@DisplayName("Record 4739: LastName is Garst")
	void LastNameOfRecord4739() {
		assertEquals("Garst", customers.get(4738).getLastName());
	}

	@Test
	@DisplayName("Record 4739: Company is Terry, Craig B Esq")
	void CompanyOfRecord4739() {
		assertEquals("Terry, Craig B Esq", customers.get(4738).getCompany());
	}

	@Test
	@DisplayName("Record 4739: Address is 855 Civic Center Dr  #-10")
	void AddressOfRecord4739() {
		assertEquals("855 Civic Center Dr  #-10", customers.get(4738).getAddress());
	}

	@Test
	@DisplayName("Record 4739: City is Santa Clara")
	void CityOfRecord4739() {
		assertEquals("Santa Clara", customers.get(4738).getCity());
	}

	@Test
	@DisplayName("Record 4739: County is Santa Clara")
	void CountyOfRecord4739() {
		assertEquals("Santa Clara", customers.get(4738).getCounty());
	}

	@Test
	@DisplayName("Record 4739: State is CA")
	void StateOfRecord4739() {
		assertEquals("CA", customers.get(4738).getState());
	}

	@Test
	@DisplayName("Record 4739: ZIP is 95050")
	void ZIPOfRecord4739() {
		assertEquals("95050", customers.get(4738).getZIP());
	}

	@Test
	@DisplayName("Record 4739: Phone is 408-243-0969")
	void PhoneOfRecord4739() {
		assertEquals("408-243-0969", customers.get(4738).getPhone());
	}

	@Test
	@DisplayName("Record 4739: Fax is 408-243-1573")
	void FaxOfRecord4739() {
		assertEquals("408-243-1573", customers.get(4738).getFax());
	}

	@Test
	@DisplayName("Record 4739: Email is dorsey@garst.com")
	void EmailOfRecord4739() {
		assertEquals("dorsey@garst.com", customers.get(4738).getEmail());
	}

	@Test
	@DisplayName("Record 4739: Web is http://www.dorseygarst.com")
	void WebOfRecord4739() {
		assertEquals("http://www.dorseygarst.com", customers.get(4738).getWeb());
	}
}
