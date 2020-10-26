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

@Tag("49")
class Record_3715 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3715: FirstName is Hillary")
	void FirstNameOfRecord3715() {
		assertEquals("Hillary", customers.get(3714).getFirstName());
	}

	@Test
	@DisplayName("Record 3715: LastName is Vecchiarelli")
	void LastNameOfRecord3715() {
		assertEquals("Vecchiarelli", customers.get(3714).getLastName());
	}

	@Test
	@DisplayName("Record 3715: Company is Wood County Telephone Company")
	void CompanyOfRecord3715() {
		assertEquals("Wood County Telephone Company", customers.get(3714).getCompany());
	}

	@Test
	@DisplayName("Record 3715: Address is 16835 Deer Creek Dr")
	void AddressOfRecord3715() {
		assertEquals("16835 Deer Creek Dr", customers.get(3714).getAddress());
	}

	@Test
	@DisplayName("Record 3715: City is Spring")
	void CityOfRecord3715() {
		assertEquals("Spring", customers.get(3714).getCity());
	}

	@Test
	@DisplayName("Record 3715: County is Harris")
	void CountyOfRecord3715() {
		assertEquals("Harris", customers.get(3714).getCounty());
	}

	@Test
	@DisplayName("Record 3715: State is TX")
	void StateOfRecord3715() {
		assertEquals("TX", customers.get(3714).getState());
	}

	@Test
	@DisplayName("Record 3715: ZIP is 77379")
	void ZIPOfRecord3715() {
		assertEquals("77379", customers.get(3714).getZIP());
	}

	@Test
	@DisplayName("Record 3715: Phone is 281-376-8554")
	void PhoneOfRecord3715() {
		assertEquals("281-376-8554", customers.get(3714).getPhone());
	}

	@Test
	@DisplayName("Record 3715: Fax is 281-376-1863")
	void FaxOfRecord3715() {
		assertEquals("281-376-1863", customers.get(3714).getFax());
	}

	@Test
	@DisplayName("Record 3715: Email is hillary@vecchiarelli.com")
	void EmailOfRecord3715() {
		assertEquals("hillary@vecchiarelli.com", customers.get(3714).getEmail());
	}

	@Test
	@DisplayName("Record 3715: Web is http://www.hillaryvecchiarelli.com")
	void WebOfRecord3715() {
		assertEquals("http://www.hillaryvecchiarelli.com", customers.get(3714).getWeb());
	}
}
