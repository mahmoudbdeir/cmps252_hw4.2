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

@Tag("13")
class Record_3554 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3554: FirstName is Alba")
	void FirstNameOfRecord3554() {
		assertEquals("Alba", customers.get(3553).getFirstName());
	}

	@Test
	@DisplayName("Record 3554: LastName is Donnie")
	void LastNameOfRecord3554() {
		assertEquals("Donnie", customers.get(3553).getLastName());
	}

	@Test
	@DisplayName("Record 3554: Company is First Montauk Securities Corp")
	void CompanyOfRecord3554() {
		assertEquals("First Montauk Securities Corp", customers.get(3553).getCompany());
	}

	@Test
	@DisplayName("Record 3554: Address is 1115 E Broomtown Rd")
	void AddressOfRecord3554() {
		assertEquals("1115 E Broomtown Rd", customers.get(3553).getAddress());
	}

	@Test
	@DisplayName("Record 3554: City is La Fayette")
	void CityOfRecord3554() {
		assertEquals("La Fayette", customers.get(3553).getCity());
	}

	@Test
	@DisplayName("Record 3554: County is Walker")
	void CountyOfRecord3554() {
		assertEquals("Walker", customers.get(3553).getCounty());
	}

	@Test
	@DisplayName("Record 3554: State is GA")
	void StateOfRecord3554() {
		assertEquals("GA", customers.get(3553).getState());
	}

	@Test
	@DisplayName("Record 3554: ZIP is 30728")
	void ZIPOfRecord3554() {
		assertEquals("30728", customers.get(3553).getZIP());
	}

	@Test
	@DisplayName("Record 3554: Phone is 706-638-1813")
	void PhoneOfRecord3554() {
		assertEquals("706-638-1813", customers.get(3553).getPhone());
	}

	@Test
	@DisplayName("Record 3554: Fax is 706-638-7755")
	void FaxOfRecord3554() {
		assertEquals("706-638-7755", customers.get(3553).getFax());
	}

	@Test
	@DisplayName("Record 3554: Email is alba@donnie.com")
	void EmailOfRecord3554() {
		assertEquals("alba@donnie.com", customers.get(3553).getEmail());
	}

	@Test
	@DisplayName("Record 3554: Web is http://www.albadonnie.com")
	void WebOfRecord3554() {
		assertEquals("http://www.albadonnie.com", customers.get(3553).getWeb());
	}
}
