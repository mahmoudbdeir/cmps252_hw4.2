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

@Tag("45")
class Record_2582 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2582: FirstName is Harrison")
	void FirstNameOfRecord2582() {
		assertEquals("Harrison", customers.get(2581).getFirstName());
	}

	@Test
	@DisplayName("Record 2582: LastName is Loewenthal")
	void LastNameOfRecord2582() {
		assertEquals("Loewenthal", customers.get(2581).getLastName());
	}

	@Test
	@DisplayName("Record 2582: Company is Kelly Beucler & Irwin Ltd")
	void CompanyOfRecord2582() {
		assertEquals("Kelly Beucler & Irwin Ltd", customers.get(2581).getCompany());
	}

	@Test
	@DisplayName("Record 2582: Address is 5446 University Pky")
	void AddressOfRecord2582() {
		assertEquals("5446 University Pky", customers.get(2581).getAddress());
	}

	@Test
	@DisplayName("Record 2582: City is Winston Salem")
	void CityOfRecord2582() {
		assertEquals("Winston Salem", customers.get(2581).getCity());
	}

	@Test
	@DisplayName("Record 2582: County is Forsyth")
	void CountyOfRecord2582() {
		assertEquals("Forsyth", customers.get(2581).getCounty());
	}

	@Test
	@DisplayName("Record 2582: State is NC")
	void StateOfRecord2582() {
		assertEquals("NC", customers.get(2581).getState());
	}

	@Test
	@DisplayName("Record 2582: ZIP is 27105")
	void ZIPOfRecord2582() {
		assertEquals("27105", customers.get(2581).getZIP());
	}

	@Test
	@DisplayName("Record 2582: Phone is 336-767-5081")
	void PhoneOfRecord2582() {
		assertEquals("336-767-5081", customers.get(2581).getPhone());
	}

	@Test
	@DisplayName("Record 2582: Fax is 336-767-7272")
	void FaxOfRecord2582() {
		assertEquals("336-767-7272", customers.get(2581).getFax());
	}

	@Test
	@DisplayName("Record 2582: Email is harrison@loewenthal.com")
	void EmailOfRecord2582() {
		assertEquals("harrison@loewenthal.com", customers.get(2581).getEmail());
	}

	@Test
	@DisplayName("Record 2582: Web is http://www.harrisonloewenthal.com")
	void WebOfRecord2582() {
		assertEquals("http://www.harrisonloewenthal.com", customers.get(2581).getWeb());
	}
}
