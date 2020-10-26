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

@Tag("44")
class Record_1816 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1816: FirstName is Wilford")
	void FirstNameOfRecord1816() {
		assertEquals("Wilford", customers.get(1815).getFirstName());
	}

	@Test
	@DisplayName("Record 1816: LastName is Hargrave")
	void LastNameOfRecord1816() {
		assertEquals("Hargrave", customers.get(1815).getLastName());
	}

	@Test
	@DisplayName("Record 1816: Company is Stauffers Machine Shop Inc")
	void CompanyOfRecord1816() {
		assertEquals("Stauffers Machine Shop Inc", customers.get(1815).getCompany());
	}

	@Test
	@DisplayName("Record 1816: Address is 460 Ludlow Ave")
	void AddressOfRecord1816() {
		assertEquals("460 Ludlow Ave", customers.get(1815).getAddress());
	}

	@Test
	@DisplayName("Record 1816: City is Cranford")
	void CityOfRecord1816() {
		assertEquals("Cranford", customers.get(1815).getCity());
	}

	@Test
	@DisplayName("Record 1816: County is Union")
	void CountyOfRecord1816() {
		assertEquals("Union", customers.get(1815).getCounty());
	}

	@Test
	@DisplayName("Record 1816: State is NJ")
	void StateOfRecord1816() {
		assertEquals("NJ", customers.get(1815).getState());
	}

	@Test
	@DisplayName("Record 1816: ZIP is 7016")
	void ZIPOfRecord1816() {
		assertEquals("7016", customers.get(1815).getZIP());
	}

	@Test
	@DisplayName("Record 1816: Phone is 908-272-8967")
	void PhoneOfRecord1816() {
		assertEquals("908-272-8967", customers.get(1815).getPhone());
	}

	@Test
	@DisplayName("Record 1816: Fax is 908-272-1017")
	void FaxOfRecord1816() {
		assertEquals("908-272-1017", customers.get(1815).getFax());
	}

	@Test
	@DisplayName("Record 1816: Email is wilford@hargrave.com")
	void EmailOfRecord1816() {
		assertEquals("wilford@hargrave.com", customers.get(1815).getEmail());
	}

	@Test
	@DisplayName("Record 1816: Web is http://www.wilfordhargrave.com")
	void WebOfRecord1816() {
		assertEquals("http://www.wilfordhargrave.com", customers.get(1815).getWeb());
	}
}
