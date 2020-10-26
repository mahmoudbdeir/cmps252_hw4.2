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

@Tag("20")
class Record_899 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 899: FirstName is Cesar")
	void FirstNameOfRecord899() {
		assertEquals("Cesar", customers.get(898).getFirstName());
	}

	@Test
	@DisplayName("Record 899: LastName is Ruffin")
	void LastNameOfRecord899() {
		assertEquals("Ruffin", customers.get(898).getLastName());
	}

	@Test
	@DisplayName("Record 899: Company is Daniel C Tanney Inc")
	void CompanyOfRecord899() {
		assertEquals("Daniel C Tanney Inc", customers.get(898).getCompany());
	}

	@Test
	@DisplayName("Record 899: Address is 747 Zeckendorf Blvd")
	void AddressOfRecord899() {
		assertEquals("747 Zeckendorf Blvd", customers.get(898).getAddress());
	}

	@Test
	@DisplayName("Record 899: City is Garden City")
	void CityOfRecord899() {
		assertEquals("Garden City", customers.get(898).getCity());
	}

	@Test
	@DisplayName("Record 899: County is Nassau")
	void CountyOfRecord899() {
		assertEquals("Nassau", customers.get(898).getCounty());
	}

	@Test
	@DisplayName("Record 899: State is NY")
	void StateOfRecord899() {
		assertEquals("NY", customers.get(898).getState());
	}

	@Test
	@DisplayName("Record 899: ZIP is 11530")
	void ZIPOfRecord899() {
		assertEquals("11530", customers.get(898).getZIP());
	}

	@Test
	@DisplayName("Record 899: Phone is 516-222-0363")
	void PhoneOfRecord899() {
		assertEquals("516-222-0363", customers.get(898).getPhone());
	}

	@Test
	@DisplayName("Record 899: Fax is 516-222-7989")
	void FaxOfRecord899() {
		assertEquals("516-222-7989", customers.get(898).getFax());
	}

	@Test
	@DisplayName("Record 899: Email is cesar@ruffin.com")
	void EmailOfRecord899() {
		assertEquals("cesar@ruffin.com", customers.get(898).getEmail());
	}

	@Test
	@DisplayName("Record 899: Web is http://www.cesarruffin.com")
	void WebOfRecord899() {
		assertEquals("http://www.cesarruffin.com", customers.get(898).getWeb());
	}
}
