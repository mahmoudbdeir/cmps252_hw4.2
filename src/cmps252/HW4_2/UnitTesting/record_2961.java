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

@Tag("23")
class Record_2961 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2961: FirstName is Portia")
	void FirstNameOfRecord2961() {
		assertEquals("Portia", customers.get(2960).getFirstName());
	}

	@Test
	@DisplayName("Record 2961: LastName is Cuccia")
	void LastNameOfRecord2961() {
		assertEquals("Cuccia", customers.get(2960).getLastName());
	}

	@Test
	@DisplayName("Record 2961: Company is Banco De La Nacion Argentina")
	void CompanyOfRecord2961() {
		assertEquals("Banco De La Nacion Argentina", customers.get(2960).getCompany());
	}

	@Test
	@DisplayName("Record 2961: Address is 2300 Marcus Ave")
	void AddressOfRecord2961() {
		assertEquals("2300 Marcus Ave", customers.get(2960).getAddress());
	}

	@Test
	@DisplayName("Record 2961: City is New Hyde Park")
	void CityOfRecord2961() {
		assertEquals("New Hyde Park", customers.get(2960).getCity());
	}

	@Test
	@DisplayName("Record 2961: County is Nassau")
	void CountyOfRecord2961() {
		assertEquals("Nassau", customers.get(2960).getCounty());
	}

	@Test
	@DisplayName("Record 2961: State is NY")
	void StateOfRecord2961() {
		assertEquals("NY", customers.get(2960).getState());
	}

	@Test
	@DisplayName("Record 2961: ZIP is 11042")
	void ZIPOfRecord2961() {
		assertEquals("11042", customers.get(2960).getZIP());
	}

	@Test
	@DisplayName("Record 2961: Phone is 516-488-5248")
	void PhoneOfRecord2961() {
		assertEquals("516-488-5248", customers.get(2960).getPhone());
	}

	@Test
	@DisplayName("Record 2961: Fax is 516-488-7851")
	void FaxOfRecord2961() {
		assertEquals("516-488-7851", customers.get(2960).getFax());
	}

	@Test
	@DisplayName("Record 2961: Email is portia@cuccia.com")
	void EmailOfRecord2961() {
		assertEquals("portia@cuccia.com", customers.get(2960).getEmail());
	}

	@Test
	@DisplayName("Record 2961: Web is http://www.portiacuccia.com")
	void WebOfRecord2961() {
		assertEquals("http://www.portiacuccia.com", customers.get(2960).getWeb());
	}
}
