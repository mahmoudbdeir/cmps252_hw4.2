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

@Tag("3")
class Record_506 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 506: FirstName is Delia")
	void FirstNameOfRecord506() {
		assertEquals("Delia", customers.get(505).getFirstName());
	}

	@Test
	@DisplayName("Record 506: LastName is Adkins")
	void LastNameOfRecord506() {
		assertEquals("Adkins", customers.get(505).getLastName());
	}

	@Test
	@DisplayName("Record 506: Company is Ocean Spray Cranberries Inc")
	void CompanyOfRecord506() {
		assertEquals("Ocean Spray Cranberries Inc", customers.get(505).getCompany());
	}

	@Test
	@DisplayName("Record 506: Address is 368 Beverage Hill Ave")
	void AddressOfRecord506() {
		assertEquals("368 Beverage Hill Ave", customers.get(505).getAddress());
	}

	@Test
	@DisplayName("Record 506: City is Pawtucket")
	void CityOfRecord506() {
		assertEquals("Pawtucket", customers.get(505).getCity());
	}

	@Test
	@DisplayName("Record 506: County is Providence")
	void CountyOfRecord506() {
		assertEquals("Providence", customers.get(505).getCounty());
	}

	@Test
	@DisplayName("Record 506: State is RI")
	void StateOfRecord506() {
		assertEquals("RI", customers.get(505).getState());
	}

	@Test
	@DisplayName("Record 506: ZIP is 2861")
	void ZIPOfRecord506() {
		assertEquals("2861", customers.get(505).getZIP());
	}

	@Test
	@DisplayName("Record 506: Phone is 401-725-9200")
	void PhoneOfRecord506() {
		assertEquals("401-725-9200", customers.get(505).getPhone());
	}

	@Test
	@DisplayName("Record 506: Fax is 401-725-0352")
	void FaxOfRecord506() {
		assertEquals("401-725-0352", customers.get(505).getFax());
	}

	@Test
	@DisplayName("Record 506: Email is delia@adkins.com")
	void EmailOfRecord506() {
		assertEquals("delia@adkins.com", customers.get(505).getEmail());
	}

	@Test
	@DisplayName("Record 506: Web is http://www.deliaadkins.com")
	void WebOfRecord506() {
		assertEquals("http://www.deliaadkins.com", customers.get(505).getWeb());
	}
}
