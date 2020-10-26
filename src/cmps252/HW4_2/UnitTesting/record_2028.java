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

@Tag("4")
class Record_2028 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2028: FirstName is Ladonna")
	void FirstNameOfRecord2028() {
		assertEquals("Ladonna", customers.get(2027).getFirstName());
	}

	@Test
	@DisplayName("Record 2028: LastName is Pollnow")
	void LastNameOfRecord2028() {
		assertEquals("Pollnow", customers.get(2027).getLastName());
	}

	@Test
	@DisplayName("Record 2028: Company is Climakra Unicorn")
	void CompanyOfRecord2028() {
		assertEquals("Climakra Unicorn", customers.get(2027).getCompany());
	}

	@Test
	@DisplayName("Record 2028: Address is 1255 Liberty Ave")
	void AddressOfRecord2028() {
		assertEquals("1255 Liberty Ave", customers.get(2027).getAddress());
	}

	@Test
	@DisplayName("Record 2028: City is Hillside")
	void CityOfRecord2028() {
		assertEquals("Hillside", customers.get(2027).getCity());
	}

	@Test
	@DisplayName("Record 2028: County is Union")
	void CountyOfRecord2028() {
		assertEquals("Union", customers.get(2027).getCounty());
	}

	@Test
	@DisplayName("Record 2028: State is NJ")
	void StateOfRecord2028() {
		assertEquals("NJ", customers.get(2027).getState());
	}

	@Test
	@DisplayName("Record 2028: ZIP is 7205")
	void ZIPOfRecord2028() {
		assertEquals("7205", customers.get(2027).getZIP());
	}

	@Test
	@DisplayName("Record 2028: Phone is 908-351-8435")
	void PhoneOfRecord2028() {
		assertEquals("908-351-8435", customers.get(2027).getPhone());
	}

	@Test
	@DisplayName("Record 2028: Fax is 908-351-8454")
	void FaxOfRecord2028() {
		assertEquals("908-351-8454", customers.get(2027).getFax());
	}

	@Test
	@DisplayName("Record 2028: Email is ladonna@pollnow.com")
	void EmailOfRecord2028() {
		assertEquals("ladonna@pollnow.com", customers.get(2027).getEmail());
	}

	@Test
	@DisplayName("Record 2028: Web is http://www.ladonnapollnow.com")
	void WebOfRecord2028() {
		assertEquals("http://www.ladonnapollnow.com", customers.get(2027).getWeb());
	}
}
