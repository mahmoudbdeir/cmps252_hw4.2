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
class Record_2481 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2481: FirstName is Ruth")
	void FirstNameOfRecord2481() {
		assertEquals("Ruth", customers.get(2480).getFirstName());
	}

	@Test
	@DisplayName("Record 2481: LastName is Kuhar")
	void LastNameOfRecord2481() {
		assertEquals("Kuhar", customers.get(2480).getLastName());
	}

	@Test
	@DisplayName("Record 2481: Company is Ind Acoustics Co Fctry Rep")
	void CompanyOfRecord2481() {
		assertEquals("Ind Acoustics Co Fctry Rep", customers.get(2480).getCompany());
	}

	@Test
	@DisplayName("Record 2481: Address is 2121 31st St Sw")
	void AddressOfRecord2481() {
		assertEquals("2121 31st St Sw", customers.get(2480).getAddress());
	}

	@Test
	@DisplayName("Record 2481: City is Allentown")
	void CityOfRecord2481() {
		assertEquals("Allentown", customers.get(2480).getCity());
	}

	@Test
	@DisplayName("Record 2481: County is Lehigh")
	void CountyOfRecord2481() {
		assertEquals("Lehigh", customers.get(2480).getCounty());
	}

	@Test
	@DisplayName("Record 2481: State is PA")
	void StateOfRecord2481() {
		assertEquals("PA", customers.get(2480).getState());
	}

	@Test
	@DisplayName("Record 2481: ZIP is 18103")
	void ZIPOfRecord2481() {
		assertEquals("18103", customers.get(2480).getZIP());
	}

	@Test
	@DisplayName("Record 2481: Phone is 610-797-9817")
	void PhoneOfRecord2481() {
		assertEquals("610-797-9817", customers.get(2480).getPhone());
	}

	@Test
	@DisplayName("Record 2481: Fax is 610-797-1136")
	void FaxOfRecord2481() {
		assertEquals("610-797-1136", customers.get(2480).getFax());
	}

	@Test
	@DisplayName("Record 2481: Email is ruth@kuhar.com")
	void EmailOfRecord2481() {
		assertEquals("ruth@kuhar.com", customers.get(2480).getEmail());
	}

	@Test
	@DisplayName("Record 2481: Web is http://www.ruthkuhar.com")
	void WebOfRecord2481() {
		assertEquals("http://www.ruthkuhar.com", customers.get(2480).getWeb());
	}
}
