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

@Tag("29")
class Record_1240 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1240: FirstName is Pasquale")
	void FirstNameOfRecord1240() {
		assertEquals("Pasquale", customers.get(1239).getFirstName());
	}

	@Test
	@DisplayName("Record 1240: LastName is Allis")
	void LastNameOfRecord1240() {
		assertEquals("Allis", customers.get(1239).getLastName());
	}

	@Test
	@DisplayName("Record 1240: Company is Faldet, Arvid S")
	void CompanyOfRecord1240() {
		assertEquals("Faldet, Arvid S", customers.get(1239).getCompany());
	}

	@Test
	@DisplayName("Record 1240: Address is 12670 E 132nd Ave")
	void AddressOfRecord1240() {
		assertEquals("12670 E 132nd Ave", customers.get(1239).getAddress());
	}

	@Test
	@DisplayName("Record 1240: City is Brighton")
	void CityOfRecord1240() {
		assertEquals("Brighton", customers.get(1239).getCity());
	}

	@Test
	@DisplayName("Record 1240: County is Adams")
	void CountyOfRecord1240() {
		assertEquals("Adams", customers.get(1239).getCounty());
	}

	@Test
	@DisplayName("Record 1240: State is CO")
	void StateOfRecord1240() {
		assertEquals("CO", customers.get(1239).getState());
	}

	@Test
	@DisplayName("Record 1240: ZIP is 80601")
	void ZIPOfRecord1240() {
		assertEquals("80601", customers.get(1239).getZIP());
	}

	@Test
	@DisplayName("Record 1240: Phone is 303-659-1049")
	void PhoneOfRecord1240() {
		assertEquals("303-659-1049", customers.get(1239).getPhone());
	}

	@Test
	@DisplayName("Record 1240: Fax is 303-659-5133")
	void FaxOfRecord1240() {
		assertEquals("303-659-5133", customers.get(1239).getFax());
	}

	@Test
	@DisplayName("Record 1240: Email is pasquale@allis.com")
	void EmailOfRecord1240() {
		assertEquals("pasquale@allis.com", customers.get(1239).getEmail());
	}

	@Test
	@DisplayName("Record 1240: Web is http://www.pasqualeallis.com")
	void WebOfRecord1240() {
		assertEquals("http://www.pasqualeallis.com", customers.get(1239).getWeb());
	}
}
