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

@Tag("46")
class Record_2678 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2678: FirstName is Katrina")
	void FirstNameOfRecord2678() {
		assertEquals("Katrina", customers.get(2677).getFirstName());
	}

	@Test
	@DisplayName("Record 2678: LastName is Beninati")
	void LastNameOfRecord2678() {
		assertEquals("Beninati", customers.get(2677).getLastName());
	}

	@Test
	@DisplayName("Record 2678: Company is Allen, Thomas F Esq")
	void CompanyOfRecord2678() {
		assertEquals("Allen, Thomas F Esq", customers.get(2677).getCompany());
	}

	@Test
	@DisplayName("Record 2678: Address is 2828 Forest Ave")
	void AddressOfRecord2678() {
		assertEquals("2828 Forest Ave", customers.get(2677).getAddress());
	}

	@Test
	@DisplayName("Record 2678: City is Staten Island")
	void CityOfRecord2678() {
		assertEquals("Staten Island", customers.get(2677).getCity());
	}

	@Test
	@DisplayName("Record 2678: County is Richmond")
	void CountyOfRecord2678() {
		assertEquals("Richmond", customers.get(2677).getCounty());
	}

	@Test
	@DisplayName("Record 2678: State is NY")
	void StateOfRecord2678() {
		assertEquals("NY", customers.get(2677).getState());
	}

	@Test
	@DisplayName("Record 2678: ZIP is 10303")
	void ZIPOfRecord2678() {
		assertEquals("10303", customers.get(2677).getZIP());
	}

	@Test
	@DisplayName("Record 2678: Phone is 718-981-3846")
	void PhoneOfRecord2678() {
		assertEquals("718-981-3846", customers.get(2677).getPhone());
	}

	@Test
	@DisplayName("Record 2678: Fax is 718-981-8138")
	void FaxOfRecord2678() {
		assertEquals("718-981-8138", customers.get(2677).getFax());
	}

	@Test
	@DisplayName("Record 2678: Email is katrina@beninati.com")
	void EmailOfRecord2678() {
		assertEquals("katrina@beninati.com", customers.get(2677).getEmail());
	}

	@Test
	@DisplayName("Record 2678: Web is http://www.katrinabeninati.com")
	void WebOfRecord2678() {
		assertEquals("http://www.katrinabeninati.com", customers.get(2677).getWeb());
	}
}
