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

@Tag("20")
class Record_816 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 816: FirstName is Ione")
	void FirstNameOfRecord816() {
		assertEquals("Ione", customers.get(815).getFirstName());
	}

	@Test
	@DisplayName("Record 816: LastName is Gallion")
	void LastNameOfRecord816() {
		assertEquals("Gallion", customers.get(815).getLastName());
	}

	@Test
	@DisplayName("Record 816: Company is Lefler, Daniel Esq")
	void CompanyOfRecord816() {
		assertEquals("Lefler, Daniel Esq", customers.get(815).getCompany());
	}

	@Test
	@DisplayName("Record 816: Address is 14 Hayestown Ave")
	void AddressOfRecord816() {
		assertEquals("14 Hayestown Ave", customers.get(815).getAddress());
	}

	@Test
	@DisplayName("Record 816: City is Danbury")
	void CityOfRecord816() {
		assertEquals("Danbury", customers.get(815).getCity());
	}

	@Test
	@DisplayName("Record 816: County is Fairfield")
	void CountyOfRecord816() {
		assertEquals("Fairfield", customers.get(815).getCounty());
	}

	@Test
	@DisplayName("Record 816: State is CT")
	void StateOfRecord816() {
		assertEquals("CT", customers.get(815).getState());
	}

	@Test
	@DisplayName("Record 816: ZIP is 6811")
	void ZIPOfRecord816() {
		assertEquals("6811", customers.get(815).getZIP());
	}

	@Test
	@DisplayName("Record 816: Phone is 203-744-7895")
	void PhoneOfRecord816() {
		assertEquals("203-744-7895", customers.get(815).getPhone());
	}

	@Test
	@DisplayName("Record 816: Fax is 203-744-3108")
	void FaxOfRecord816() {
		assertEquals("203-744-3108", customers.get(815).getFax());
	}

	@Test
	@DisplayName("Record 816: Email is ione@gallion.com")
	void EmailOfRecord816() {
		assertEquals("ione@gallion.com", customers.get(815).getEmail());
	}

	@Test
	@DisplayName("Record 816: Web is http://www.ionegallion.com")
	void WebOfRecord816() {
		assertEquals("http://www.ionegallion.com", customers.get(815).getWeb());
	}
}
