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

@Tag("46")
class Record_3901 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3901: FirstName is Royce")
	void FirstNameOfRecord3901() {
		assertEquals("Royce", customers.get(3900).getFirstName());
	}

	@Test
	@DisplayName("Record 3901: LastName is Beyett")
	void LastNameOfRecord3901() {
		assertEquals("Beyett", customers.get(3900).getLastName());
	}

	@Test
	@DisplayName("Record 3901: Company is Vanderbeck, Ronald L")
	void CompanyOfRecord3901() {
		assertEquals("Vanderbeck, Ronald L", customers.get(3900).getCompany());
	}

	@Test
	@DisplayName("Record 3901: Address is 575 W Parks Dr")
	void AddressOfRecord3901() {
		assertEquals("575 W Parks Dr", customers.get(3900).getAddress());
	}

	@Test
	@DisplayName("Record 3901: City is Rensselaer")
	void CityOfRecord3901() {
		assertEquals("Rensselaer", customers.get(3900).getCity());
	}

	@Test
	@DisplayName("Record 3901: County is Jasper")
	void CountyOfRecord3901() {
		assertEquals("Jasper", customers.get(3900).getCounty());
	}

	@Test
	@DisplayName("Record 3901: State is IN")
	void StateOfRecord3901() {
		assertEquals("IN", customers.get(3900).getState());
	}

	@Test
	@DisplayName("Record 3901: ZIP is 47978")
	void ZIPOfRecord3901() {
		assertEquals("47978", customers.get(3900).getZIP());
	}

	@Test
	@DisplayName("Record 3901: Phone is 219-866-3492")
	void PhoneOfRecord3901() {
		assertEquals("219-866-3492", customers.get(3900).getPhone());
	}

	@Test
	@DisplayName("Record 3901: Fax is 219-866-7319")
	void FaxOfRecord3901() {
		assertEquals("219-866-7319", customers.get(3900).getFax());
	}

	@Test
	@DisplayName("Record 3901: Email is royce@beyett.com")
	void EmailOfRecord3901() {
		assertEquals("royce@beyett.com", customers.get(3900).getEmail());
	}

	@Test
	@DisplayName("Record 3901: Web is http://www.roycebeyett.com")
	void WebOfRecord3901() {
		assertEquals("http://www.roycebeyett.com", customers.get(3900).getWeb());
	}
}
