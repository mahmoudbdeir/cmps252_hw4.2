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

@Tag("22")
class Record_2938 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2938: FirstName is Stacie")
	void FirstNameOfRecord2938() {
		assertEquals("Stacie", customers.get(2937).getFirstName());
	}

	@Test
	@DisplayName("Record 2938: LastName is Kokaly")
	void LastNameOfRecord2938() {
		assertEquals("Kokaly", customers.get(2937).getLastName());
	}

	@Test
	@DisplayName("Record 2938: Company is Lewis Ken Appraiser Inc")
	void CompanyOfRecord2938() {
		assertEquals("Lewis Ken Appraiser Inc", customers.get(2937).getCompany());
	}

	@Test
	@DisplayName("Record 2938: Address is 1821 Logan Ave")
	void AddressOfRecord2938() {
		assertEquals("1821 Logan Ave", customers.get(2937).getAddress());
	}

	@Test
	@DisplayName("Record 2938: City is Cheyenne")
	void CityOfRecord2938() {
		assertEquals("Cheyenne", customers.get(2937).getCity());
	}

	@Test
	@DisplayName("Record 2938: County is Laramie")
	void CountyOfRecord2938() {
		assertEquals("Laramie", customers.get(2937).getCounty());
	}

	@Test
	@DisplayName("Record 2938: State is WY")
	void StateOfRecord2938() {
		assertEquals("WY", customers.get(2937).getState());
	}

	@Test
	@DisplayName("Record 2938: ZIP is 82001")
	void ZIPOfRecord2938() {
		assertEquals("82001", customers.get(2937).getZIP());
	}

	@Test
	@DisplayName("Record 2938: Phone is 307-638-4263")
	void PhoneOfRecord2938() {
		assertEquals("307-638-4263", customers.get(2937).getPhone());
	}

	@Test
	@DisplayName("Record 2938: Fax is 307-638-0552")
	void FaxOfRecord2938() {
		assertEquals("307-638-0552", customers.get(2937).getFax());
	}

	@Test
	@DisplayName("Record 2938: Email is stacie@kokaly.com")
	void EmailOfRecord2938() {
		assertEquals("stacie@kokaly.com", customers.get(2937).getEmail());
	}

	@Test
	@DisplayName("Record 2938: Web is http://www.staciekokaly.com")
	void WebOfRecord2938() {
		assertEquals("http://www.staciekokaly.com", customers.get(2937).getWeb());
	}
}
