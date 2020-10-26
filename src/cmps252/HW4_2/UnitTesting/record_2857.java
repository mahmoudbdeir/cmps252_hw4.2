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

@Tag("25")
class Record_2857 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2857: FirstName is Mable")
	void FirstNameOfRecord2857() {
		assertEquals("Mable", customers.get(2856).getFirstName());
	}

	@Test
	@DisplayName("Record 2857: LastName is Burbidge")
	void LastNameOfRecord2857() {
		assertEquals("Burbidge", customers.get(2856).getLastName());
	}

	@Test
	@DisplayName("Record 2857: Company is Preston, Frank W Esq")
	void CompanyOfRecord2857() {
		assertEquals("Preston, Frank W Esq", customers.get(2856).getCompany());
	}

	@Test
	@DisplayName("Record 2857: Address is 107 Richmond Ave")
	void AddressOfRecord2857() {
		assertEquals("107 Richmond Ave", customers.get(2856).getAddress());
	}

	@Test
	@DisplayName("Record 2857: City is Worcester")
	void CityOfRecord2857() {
		assertEquals("Worcester", customers.get(2856).getCity());
	}

	@Test
	@DisplayName("Record 2857: County is Worcester")
	void CountyOfRecord2857() {
		assertEquals("Worcester", customers.get(2856).getCounty());
	}

	@Test
	@DisplayName("Record 2857: State is MA")
	void StateOfRecord2857() {
		assertEquals("MA", customers.get(2856).getState());
	}

	@Test
	@DisplayName("Record 2857: ZIP is 1602")
	void ZIPOfRecord2857() {
		assertEquals("01602", customers.get(2856).getZIP());
	}

	@Test
	@DisplayName("Record 2857: Phone is 508-791-6093")
	void PhoneOfRecord2857() {
		assertEquals("508-791-6093", customers.get(2856).getPhone());
	}

	@Test
	@DisplayName("Record 2857: Fax is 508-791-9513")
	void FaxOfRecord2857() {
		assertEquals("508-791-9513", customers.get(2856).getFax());
	}

	@Test
	@DisplayName("Record 2857: Email is mable@burbidge.com")
	void EmailOfRecord2857() {
		assertEquals("mable@burbidge.com", customers.get(2856).getEmail());
	}

	@Test
	@DisplayName("Record 2857: Web is http://www.mableburbidge.com")
	void WebOfRecord2857() {
		assertEquals("http://www.mableburbidge.com", customers.get(2856).getWeb());
	}
}
