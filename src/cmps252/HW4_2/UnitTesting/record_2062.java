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

@Tag("6")
class Record_2062 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2062: FirstName is Mario")
	void FirstNameOfRecord2062() {
		assertEquals("Mario", customers.get(2061).getFirstName());
	}

	@Test
	@DisplayName("Record 2062: LastName is Wyrich")
	void LastNameOfRecord2062() {
		assertEquals("Wyrich", customers.get(2061).getLastName());
	}

	@Test
	@DisplayName("Record 2062: Company is George F Pettinos Inc")
	void CompanyOfRecord2062() {
		assertEquals("George F Pettinos Inc", customers.get(2061).getCompany());
	}

	@Test
	@DisplayName("Record 2062: Address is 1742 Norristown Rd")
	void AddressOfRecord2062() {
		assertEquals("1742 Norristown Rd", customers.get(2061).getAddress());
	}

	@Test
	@DisplayName("Record 2062: City is Ambler")
	void CityOfRecord2062() {
		assertEquals("Ambler", customers.get(2061).getCity());
	}

	@Test
	@DisplayName("Record 2062: County is Montgomery")
	void CountyOfRecord2062() {
		assertEquals("Montgomery", customers.get(2061).getCounty());
	}

	@Test
	@DisplayName("Record 2062: State is PA")
	void StateOfRecord2062() {
		assertEquals("PA", customers.get(2061).getState());
	}

	@Test
	@DisplayName("Record 2062: ZIP is 19002")
	void ZIPOfRecord2062() {
		assertEquals("19002", customers.get(2061).getZIP());
	}

	@Test
	@DisplayName("Record 2062: Phone is 215-540-7779")
	void PhoneOfRecord2062() {
		assertEquals("215-540-7779", customers.get(2061).getPhone());
	}

	@Test
	@DisplayName("Record 2062: Fax is 215-540-0865")
	void FaxOfRecord2062() {
		assertEquals("215-540-0865", customers.get(2061).getFax());
	}

	@Test
	@DisplayName("Record 2062: Email is mario@wyrich.com")
	void EmailOfRecord2062() {
		assertEquals("mario@wyrich.com", customers.get(2061).getEmail());
	}

	@Test
	@DisplayName("Record 2062: Web is http://www.mariowyrich.com")
	void WebOfRecord2062() {
		assertEquals("http://www.mariowyrich.com", customers.get(2061).getWeb());
	}
}
