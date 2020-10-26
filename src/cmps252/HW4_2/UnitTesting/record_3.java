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

@Tag("28")
class Record_3 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3: FirstName is Brady")
	void FirstNameOfRecord3() {
		assertEquals("Brady", customers.get(2).getFirstName());
	}

	@Test
	@DisplayName("Record 3: LastName is Tatum")
	void LastNameOfRecord3() {
		assertEquals("Tatum", customers.get(2).getLastName());
	}

	@Test
	@DisplayName("Record 3: Company is Bohlin, Cywinski Jackson")
	void CompanyOfRecord3() {
		assertEquals("Bohlin, Cywinski Jackson", customers.get(2).getCompany());
	}

	@Test
	@DisplayName("Record 3: Address is 710 N Cable Rd")
	void AddressOfRecord3() {
		assertEquals("710 N Cable Rd", customers.get(2).getAddress());
	}

	@Test
	@DisplayName("Record 3: City is Lima")
	void CityOfRecord3() {
		assertEquals("Lima", customers.get(2).getCity());
	}

	@Test
	@DisplayName("Record 3: County is Allen")
	void CountyOfRecord3() {
		assertEquals("Allen", customers.get(2).getCounty());
	}

	@Test
	@DisplayName("Record 3: State is OH")
	void StateOfRecord3() {
		assertEquals("OH", customers.get(2).getState());
	}

	@Test
	@DisplayName("Record 3: ZIP is 45805")
	void ZIPOfRecord3() {
		assertEquals("45805", customers.get(2).getZIP());
	}

	@Test
	@DisplayName("Record 3: Phone is 419-222-8541")
	void PhoneOfRecord3() {
		assertEquals("419-222-8541", customers.get(2).getPhone());
	}

	@Test
	@DisplayName("Record 3: Fax is 419-222-6601")
	void FaxOfRecord3() {
		assertEquals("419-222-6601", customers.get(2).getFax());
	}

	@Test
	@DisplayName("Record 3: Email is brady@tatum.com")
	void EmailOfRecord3() {
		assertEquals("brady@tatum.com", customers.get(2).getEmail());
	}

	@Test
	@DisplayName("Record 3: Web is http://www.bradytatum.com")
	void WebOfRecord3() {
		assertEquals("http://www.bradytatum.com", customers.get(2).getWeb());
	}
}
