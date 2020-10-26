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
class Record_1151 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1151: FirstName is Deborah")
	void FirstNameOfRecord1151() {
		assertEquals("Deborah", customers.get(1150).getFirstName());
	}

	@Test
	@DisplayName("Record 1151: LastName is Klimaszewski")
	void LastNameOfRecord1151() {
		assertEquals("Klimaszewski", customers.get(1150).getLastName());
	}

	@Test
	@DisplayName("Record 1151: Company is Armour Pavement Inc")
	void CompanyOfRecord1151() {
		assertEquals("Armour Pavement Inc", customers.get(1150).getCompany());
	}

	@Test
	@DisplayName("Record 1151: Address is 826 Saint George Ave")
	void AddressOfRecord1151() {
		assertEquals("826 Saint George Ave", customers.get(1150).getAddress());
	}

	@Test
	@DisplayName("Record 1151: City is Woodbridge")
	void CityOfRecord1151() {
		assertEquals("Woodbridge", customers.get(1150).getCity());
	}

	@Test
	@DisplayName("Record 1151: County is Middlesex")
	void CountyOfRecord1151() {
		assertEquals("Middlesex", customers.get(1150).getCounty());
	}

	@Test
	@DisplayName("Record 1151: State is NJ")
	void StateOfRecord1151() {
		assertEquals("NJ", customers.get(1150).getState());
	}

	@Test
	@DisplayName("Record 1151: ZIP is 7095")
	void ZIPOfRecord1151() {
		assertEquals("7095", customers.get(1150).getZIP());
	}

	@Test
	@DisplayName("Record 1151: Phone is 732-634-3479")
	void PhoneOfRecord1151() {
		assertEquals("732-634-3479", customers.get(1150).getPhone());
	}

	@Test
	@DisplayName("Record 1151: Fax is 732-634-3391")
	void FaxOfRecord1151() {
		assertEquals("732-634-3391", customers.get(1150).getFax());
	}

	@Test
	@DisplayName("Record 1151: Email is deborah@klimaszewski.com")
	void EmailOfRecord1151() {
		assertEquals("deborah@klimaszewski.com", customers.get(1150).getEmail());
	}

	@Test
	@DisplayName("Record 1151: Web is http://www.deborahklimaszewski.com")
	void WebOfRecord1151() {
		assertEquals("http://www.deborahklimaszewski.com", customers.get(1150).getWeb());
	}
}
