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

@Tag("40")
class Record_2807 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2807: FirstName is Patricia")
	void FirstNameOfRecord2807() {
		assertEquals("Patricia", customers.get(2806).getFirstName());
	}

	@Test
	@DisplayName("Record 2807: LastName is Goodenow")
	void LastNameOfRecord2807() {
		assertEquals("Goodenow", customers.get(2806).getLastName());
	}

	@Test
	@DisplayName("Record 2807: Company is Accutech Laser Proc")
	void CompanyOfRecord2807() {
		assertEquals("Accutech Laser Proc", customers.get(2806).getCompany());
	}

	@Test
	@DisplayName("Record 2807: Address is 6105 S Ash Ave  #-a1")
	void AddressOfRecord2807() {
		assertEquals("6105 S Ash Ave  #-a1", customers.get(2806).getAddress());
	}

	@Test
	@DisplayName("Record 2807: City is Tempe")
	void CityOfRecord2807() {
		assertEquals("Tempe", customers.get(2806).getCity());
	}

	@Test
	@DisplayName("Record 2807: County is Maricopa")
	void CountyOfRecord2807() {
		assertEquals("Maricopa", customers.get(2806).getCounty());
	}

	@Test
	@DisplayName("Record 2807: State is AZ")
	void StateOfRecord2807() {
		assertEquals("AZ", customers.get(2806).getState());
	}

	@Test
	@DisplayName("Record 2807: ZIP is 85283")
	void ZIPOfRecord2807() {
		assertEquals("85283", customers.get(2806).getZIP());
	}

	@Test
	@DisplayName("Record 2807: Phone is 480-831-9676")
	void PhoneOfRecord2807() {
		assertEquals("480-831-9676", customers.get(2806).getPhone());
	}

	@Test
	@DisplayName("Record 2807: Fax is 480-831-0855")
	void FaxOfRecord2807() {
		assertEquals("480-831-0855", customers.get(2806).getFax());
	}

	@Test
	@DisplayName("Record 2807: Email is patricia@goodenow.com")
	void EmailOfRecord2807() {
		assertEquals("patricia@goodenow.com", customers.get(2806).getEmail());
	}

	@Test
	@DisplayName("Record 2807: Web is http://www.patriciagoodenow.com")
	void WebOfRecord2807() {
		assertEquals("http://www.patriciagoodenow.com", customers.get(2806).getWeb());
	}
}
