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

@Tag("41")
class Record_2576 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2576: FirstName is Ted")
	void FirstNameOfRecord2576() {
		assertEquals("Ted", customers.get(2575).getFirstName());
	}

	@Test
	@DisplayName("Record 2576: LastName is Wisler")
	void LastNameOfRecord2576() {
		assertEquals("Wisler", customers.get(2575).getLastName());
	}

	@Test
	@DisplayName("Record 2576: Company is Wheeler Mfg")
	void CompanyOfRecord2576() {
		assertEquals("Wheeler Mfg", customers.get(2575).getCompany());
	}

	@Test
	@DisplayName("Record 2576: Address is 8 Nolan Rd")
	void AddressOfRecord2576() {
		assertEquals("8 Nolan Rd", customers.get(2575).getAddress());
	}

	@Test
	@DisplayName("Record 2576: City is Albany")
	void CityOfRecord2576() {
		assertEquals("Albany", customers.get(2575).getCity());
	}

	@Test
	@DisplayName("Record 2576: County is Albany")
	void CountyOfRecord2576() {
		assertEquals("Albany", customers.get(2575).getCounty());
	}

	@Test
	@DisplayName("Record 2576: State is NY")
	void StateOfRecord2576() {
		assertEquals("NY", customers.get(2575).getState());
	}

	@Test
	@DisplayName("Record 2576: ZIP is 12205")
	void ZIPOfRecord2576() {
		assertEquals("12205", customers.get(2575).getZIP());
	}

	@Test
	@DisplayName("Record 2576: Phone is 518-452-2821")
	void PhoneOfRecord2576() {
		assertEquals("518-452-2821", customers.get(2575).getPhone());
	}

	@Test
	@DisplayName("Record 2576: Fax is 518-452-2505")
	void FaxOfRecord2576() {
		assertEquals("518-452-2505", customers.get(2575).getFax());
	}

	@Test
	@DisplayName("Record 2576: Email is ted@wisler.com")
	void EmailOfRecord2576() {
		assertEquals("ted@wisler.com", customers.get(2575).getEmail());
	}

	@Test
	@DisplayName("Record 2576: Web is http://www.tedwisler.com")
	void WebOfRecord2576() {
		assertEquals("http://www.tedwisler.com", customers.get(2575).getWeb());
	}
}
