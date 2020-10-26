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

@Tag("47")
class Record_3512 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3512: FirstName is Jeramy")
	void FirstNameOfRecord3512() {
		assertEquals("Jeramy", customers.get(3511).getFirstName());
	}

	@Test
	@DisplayName("Record 3512: LastName is Yepes")
	void LastNameOfRecord3512() {
		assertEquals("Yepes", customers.get(3511).getLastName());
	}

	@Test
	@DisplayName("Record 3512: Company is Winoma Knits")
	void CompanyOfRecord3512() {
		assertEquals("Winoma Knits", customers.get(3511).getCompany());
	}

	@Test
	@DisplayName("Record 3512: Address is 11631 Clark St  #-102")
	void AddressOfRecord3512() {
		assertEquals("11631 Clark St  #-102", customers.get(3511).getAddress());
	}

	@Test
	@DisplayName("Record 3512: City is Arcadia")
	void CityOfRecord3512() {
		assertEquals("Arcadia", customers.get(3511).getCity());
	}

	@Test
	@DisplayName("Record 3512: County is Los Angeles")
	void CountyOfRecord3512() {
		assertEquals("Los Angeles", customers.get(3511).getCounty());
	}

	@Test
	@DisplayName("Record 3512: State is CA")
	void StateOfRecord3512() {
		assertEquals("CA", customers.get(3511).getState());
	}

	@Test
	@DisplayName("Record 3512: ZIP is 91006")
	void ZIPOfRecord3512() {
		assertEquals("91006", customers.get(3511).getZIP());
	}

	@Test
	@DisplayName("Record 3512: Phone is 626-357-3726")
	void PhoneOfRecord3512() {
		assertEquals("626-357-3726", customers.get(3511).getPhone());
	}

	@Test
	@DisplayName("Record 3512: Fax is 626-357-7342")
	void FaxOfRecord3512() {
		assertEquals("626-357-7342", customers.get(3511).getFax());
	}

	@Test
	@DisplayName("Record 3512: Email is jeramy@yepes.com")
	void EmailOfRecord3512() {
		assertEquals("jeramy@yepes.com", customers.get(3511).getEmail());
	}

	@Test
	@DisplayName("Record 3512: Web is http://www.jeramyyepes.com")
	void WebOfRecord3512() {
		assertEquals("http://www.jeramyyepes.com", customers.get(3511).getWeb());
	}
}
