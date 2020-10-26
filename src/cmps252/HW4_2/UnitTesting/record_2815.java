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

@Tag("3")
class Record_2815 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2815: FirstName is Oswaldo")
	void FirstNameOfRecord2815() {
		assertEquals("Oswaldo", customers.get(2814).getFirstName());
	}

	@Test
	@DisplayName("Record 2815: LastName is Strome")
	void LastNameOfRecord2815() {
		assertEquals("Strome", customers.get(2814).getLastName());
	}

	@Test
	@DisplayName("Record 2815: Company is Brannen, Geo W Esq")
	void CompanyOfRecord2815() {
		assertEquals("Brannen, Geo W Esq", customers.get(2814).getCompany());
	}

	@Test
	@DisplayName("Record 2815: Address is 65 Clifton Blvd")
	void AddressOfRecord2815() {
		assertEquals("65 Clifton Blvd", customers.get(2814).getAddress());
	}

	@Test
	@DisplayName("Record 2815: City is Clifton")
	void CityOfRecord2815() {
		assertEquals("Clifton", customers.get(2814).getCity());
	}

	@Test
	@DisplayName("Record 2815: County is Passaic")
	void CountyOfRecord2815() {
		assertEquals("Passaic", customers.get(2814).getCounty());
	}

	@Test
	@DisplayName("Record 2815: State is NJ")
	void StateOfRecord2815() {
		assertEquals("NJ", customers.get(2814).getState());
	}

	@Test
	@DisplayName("Record 2815: ZIP is 7011")
	void ZIPOfRecord2815() {
		assertEquals("7011", customers.get(2814).getZIP());
	}

	@Test
	@DisplayName("Record 2815: Phone is 973-779-2496")
	void PhoneOfRecord2815() {
		assertEquals("973-779-2496", customers.get(2814).getPhone());
	}

	@Test
	@DisplayName("Record 2815: Fax is 973-779-1556")
	void FaxOfRecord2815() {
		assertEquals("973-779-1556", customers.get(2814).getFax());
	}

	@Test
	@DisplayName("Record 2815: Email is oswaldo@strome.com")
	void EmailOfRecord2815() {
		assertEquals("oswaldo@strome.com", customers.get(2814).getEmail());
	}

	@Test
	@DisplayName("Record 2815: Web is http://www.oswaldostrome.com")
	void WebOfRecord2815() {
		assertEquals("http://www.oswaldostrome.com", customers.get(2814).getWeb());
	}
}
