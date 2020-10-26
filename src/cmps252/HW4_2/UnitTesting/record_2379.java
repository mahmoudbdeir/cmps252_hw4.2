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

@Tag("32")
class Record_2379 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2379: FirstName is Jacqueline")
	void FirstNameOfRecord2379() {
		assertEquals("Jacqueline", customers.get(2378).getFirstName());
	}

	@Test
	@DisplayName("Record 2379: LastName is Rutty")
	void LastNameOfRecord2379() {
		assertEquals("Rutty", customers.get(2378).getLastName());
	}

	@Test
	@DisplayName("Record 2379: Company is Savasort Corp")
	void CompanyOfRecord2379() {
		assertEquals("Savasort Corp", customers.get(2378).getCompany());
	}

	@Test
	@DisplayName("Record 2379: Address is 744 222 Dr")
	void AddressOfRecord2379() {
		assertEquals("744 222 Dr", customers.get(2378).getAddress());
	}

	@Test
	@DisplayName("Record 2379: City is Waukesha")
	void CityOfRecord2379() {
		assertEquals("Waukesha", customers.get(2378).getCity());
	}

	@Test
	@DisplayName("Record 2379: County is Waukesha")
	void CountyOfRecord2379() {
		assertEquals("Waukesha", customers.get(2378).getCounty());
	}

	@Test
	@DisplayName("Record 2379: State is WI")
	void StateOfRecord2379() {
		assertEquals("WI", customers.get(2378).getState());
	}

	@Test
	@DisplayName("Record 2379: ZIP is 53186")
	void ZIPOfRecord2379() {
		assertEquals("53186", customers.get(2378).getZIP());
	}

	@Test
	@DisplayName("Record 2379: Phone is 262-549-9297")
	void PhoneOfRecord2379() {
		assertEquals("262-549-9297", customers.get(2378).getPhone());
	}

	@Test
	@DisplayName("Record 2379: Fax is 262-549-0977")
	void FaxOfRecord2379() {
		assertEquals("262-549-0977", customers.get(2378).getFax());
	}

	@Test
	@DisplayName("Record 2379: Email is jacqueline@rutty.com")
	void EmailOfRecord2379() {
		assertEquals("jacqueline@rutty.com", customers.get(2378).getEmail());
	}

	@Test
	@DisplayName("Record 2379: Web is http://www.jacquelinerutty.com")
	void WebOfRecord2379() {
		assertEquals("http://www.jacquelinerutty.com", customers.get(2378).getWeb());
	}
}
