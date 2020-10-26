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

@Tag("43")
class Record_3894 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3894: FirstName is Madelyne")
	void FirstNameOfRecord3894() {
		assertEquals("Madelyne", customers.get(3893).getFirstName());
	}

	@Test
	@DisplayName("Record 3894: LastName is Rickers")
	void LastNameOfRecord3894() {
		assertEquals("Rickers", customers.get(3893).getLastName());
	}

	@Test
	@DisplayName("Record 3894: Company is Maxwell Myers Co")
	void CompanyOfRecord3894() {
		assertEquals("Maxwell Myers Co", customers.get(3893).getCompany());
	}

	@Test
	@DisplayName("Record 3894: Address is 195 Merrimac St")
	void AddressOfRecord3894() {
		assertEquals("195 Merrimac St", customers.get(3893).getAddress());
	}

	@Test
	@DisplayName("Record 3894: City is Woburn")
	void CityOfRecord3894() {
		assertEquals("Woburn", customers.get(3893).getCity());
	}

	@Test
	@DisplayName("Record 3894: County is Middlesex")
	void CountyOfRecord3894() {
		assertEquals("Middlesex", customers.get(3893).getCounty());
	}

	@Test
	@DisplayName("Record 3894: State is MA")
	void StateOfRecord3894() {
		assertEquals("MA", customers.get(3893).getState());
	}

	@Test
	@DisplayName("Record 3894: ZIP is 1801")
	void ZIPOfRecord3894() {
		assertEquals("1801", customers.get(3893).getZIP());
	}

	@Test
	@DisplayName("Record 3894: Phone is 781-935-3189")
	void PhoneOfRecord3894() {
		assertEquals("781-935-3189", customers.get(3893).getPhone());
	}

	@Test
	@DisplayName("Record 3894: Fax is 781-935-9265")
	void FaxOfRecord3894() {
		assertEquals("781-935-9265", customers.get(3893).getFax());
	}

	@Test
	@DisplayName("Record 3894: Email is madelyne@rickers.com")
	void EmailOfRecord3894() {
		assertEquals("madelyne@rickers.com", customers.get(3893).getEmail());
	}

	@Test
	@DisplayName("Record 3894: Web is http://www.madelynerickers.com")
	void WebOfRecord3894() {
		assertEquals("http://www.madelynerickers.com", customers.get(3893).getWeb());
	}
}
