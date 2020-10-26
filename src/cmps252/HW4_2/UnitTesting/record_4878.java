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
class Record_4878 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4878: FirstName is Bridgette")
	void FirstNameOfRecord4878() {
		assertEquals("Bridgette", customers.get(4877).getFirstName());
	}

	@Test
	@DisplayName("Record 4878: LastName is Boakye")
	void LastNameOfRecord4878() {
		assertEquals("Boakye", customers.get(4877).getLastName());
	}

	@Test
	@DisplayName("Record 4878: Company is Alagood, Charles Gregory Esq")
	void CompanyOfRecord4878() {
		assertEquals("Alagood, Charles Gregory Esq", customers.get(4877).getCompany());
	}

	@Test
	@DisplayName("Record 4878: Address is 2 Maple Ave")
	void AddressOfRecord4878() {
		assertEquals("2 Maple Ave", customers.get(4877).getAddress());
	}

	@Test
	@DisplayName("Record 4878: City is Pennsville")
	void CityOfRecord4878() {
		assertEquals("Pennsville", customers.get(4877).getCity());
	}

	@Test
	@DisplayName("Record 4878: County is Salem")
	void CountyOfRecord4878() {
		assertEquals("Salem", customers.get(4877).getCounty());
	}

	@Test
	@DisplayName("Record 4878: State is NJ")
	void StateOfRecord4878() {
		assertEquals("NJ", customers.get(4877).getState());
	}

	@Test
	@DisplayName("Record 4878: ZIP is 8070")
	void ZIPOfRecord4878() {
		assertEquals("8070", customers.get(4877).getZIP());
	}

	@Test
	@DisplayName("Record 4878: Phone is 856-678-2426")
	void PhoneOfRecord4878() {
		assertEquals("856-678-2426", customers.get(4877).getPhone());
	}

	@Test
	@DisplayName("Record 4878: Fax is 856-678-2002")
	void FaxOfRecord4878() {
		assertEquals("856-678-2002", customers.get(4877).getFax());
	}

	@Test
	@DisplayName("Record 4878: Email is bridgette@boakye.com")
	void EmailOfRecord4878() {
		assertEquals("bridgette@boakye.com", customers.get(4877).getEmail());
	}

	@Test
	@DisplayName("Record 4878: Web is http://www.bridgetteboakye.com")
	void WebOfRecord4878() {
		assertEquals("http://www.bridgetteboakye.com", customers.get(4877).getWeb());
	}
}
