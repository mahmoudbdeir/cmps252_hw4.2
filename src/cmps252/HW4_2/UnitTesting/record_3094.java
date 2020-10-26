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

@Tag("48")
class Record_3094 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3094: FirstName is Randell")
	void FirstNameOfRecord3094() {
		assertEquals("Randell", customers.get(3093).getFirstName());
	}

	@Test
	@DisplayName("Record 3094: LastName is Milanese")
	void LastNameOfRecord3094() {
		assertEquals("Milanese", customers.get(3093).getLastName());
	}

	@Test
	@DisplayName("Record 3094: Company is Rf Systems")
	void CompanyOfRecord3094() {
		assertEquals("Rf Systems", customers.get(3093).getCompany());
	}

	@Test
	@DisplayName("Record 3094: Address is Memorial Pkwy")
	void AddressOfRecord3094() {
		assertEquals("Memorial Pkwy", customers.get(3093).getAddress());
	}

	@Test
	@DisplayName("Record 3094: City is Phillipsburg")
	void CityOfRecord3094() {
		assertEquals("Phillipsburg", customers.get(3093).getCity());
	}

	@Test
	@DisplayName("Record 3094: County is Warren")
	void CountyOfRecord3094() {
		assertEquals("Warren", customers.get(3093).getCounty());
	}

	@Test
	@DisplayName("Record 3094: State is NJ")
	void StateOfRecord3094() {
		assertEquals("NJ", customers.get(3093).getState());
	}

	@Test
	@DisplayName("Record 3094: ZIP is 8865")
	void ZIPOfRecord3094() {
		assertEquals("8865", customers.get(3093).getZIP());
	}

	@Test
	@DisplayName("Record 3094: Phone is 908-859-4240")
	void PhoneOfRecord3094() {
		assertEquals("908-859-4240", customers.get(3093).getPhone());
	}

	@Test
	@DisplayName("Record 3094: Fax is 908-859-0238")
	void FaxOfRecord3094() {
		assertEquals("908-859-0238", customers.get(3093).getFax());
	}

	@Test
	@DisplayName("Record 3094: Email is randell@milanese.com")
	void EmailOfRecord3094() {
		assertEquals("randell@milanese.com", customers.get(3093).getEmail());
	}

	@Test
	@DisplayName("Record 3094: Web is http://www.randellmilanese.com")
	void WebOfRecord3094() {
		assertEquals("http://www.randellmilanese.com", customers.get(3093).getWeb());
	}
}
