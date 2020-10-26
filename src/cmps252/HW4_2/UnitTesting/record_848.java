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

@Tag("8")
class Record_848 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 848: FirstName is Gregg")
	void FirstNameOfRecord848() {
		assertEquals("Gregg", customers.get(847).getFirstName());
	}

	@Test
	@DisplayName("Record 848: LastName is Barz")
	void LastNameOfRecord848() {
		assertEquals("Barz", customers.get(847).getLastName());
	}

	@Test
	@DisplayName("Record 848: Company is Wiviott, Lory D Md")
	void CompanyOfRecord848() {
		assertEquals("Wiviott, Lory D Md", customers.get(847).getCompany());
	}

	@Test
	@DisplayName("Record 848: Address is 827 Arnold Dr")
	void AddressOfRecord848() {
		assertEquals("827 Arnold Dr", customers.get(847).getAddress());
	}

	@Test
	@DisplayName("Record 848: City is Martinez")
	void CityOfRecord848() {
		assertEquals("Martinez", customers.get(847).getCity());
	}

	@Test
	@DisplayName("Record 848: County is Contra Costa")
	void CountyOfRecord848() {
		assertEquals("Contra Costa", customers.get(847).getCounty());
	}

	@Test
	@DisplayName("Record 848: State is CA")
	void StateOfRecord848() {
		assertEquals("CA", customers.get(847).getState());
	}

	@Test
	@DisplayName("Record 848: ZIP is 94553")
	void ZIPOfRecord848() {
		assertEquals("94553", customers.get(847).getZIP());
	}

	@Test
	@DisplayName("Record 848: Phone is 925-228-0167")
	void PhoneOfRecord848() {
		assertEquals("925-228-0167", customers.get(847).getPhone());
	}

	@Test
	@DisplayName("Record 848: Fax is 925-228-1352")
	void FaxOfRecord848() {
		assertEquals("925-228-1352", customers.get(847).getFax());
	}

	@Test
	@DisplayName("Record 848: Email is gregg@barz.com")
	void EmailOfRecord848() {
		assertEquals("gregg@barz.com", customers.get(847).getEmail());
	}

	@Test
	@DisplayName("Record 848: Web is http://www.greggbarz.com")
	void WebOfRecord848() {
		assertEquals("http://www.greggbarz.com", customers.get(847).getWeb());
	}
}
