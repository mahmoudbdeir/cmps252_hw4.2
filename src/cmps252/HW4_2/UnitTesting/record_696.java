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

@Tag("16")
class Record_696 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 696: FirstName is Annetta")
	void FirstNameOfRecord696() {
		assertEquals("Annetta", customers.get(695).getFirstName());
	}

	@Test
	@DisplayName("Record 696: LastName is Rugga")
	void LastNameOfRecord696() {
		assertEquals("Rugga", customers.get(695).getLastName());
	}

	@Test
	@DisplayName("Record 696: Company is Catholic Medl Ctr Schl Nurse")
	void CompanyOfRecord696() {
		assertEquals("Catholic Medl Ctr Schl Nurse", customers.get(695).getCompany());
	}

	@Test
	@DisplayName("Record 696: Address is 4 Gardner Rd")
	void AddressOfRecord696() {
		assertEquals("4 Gardner Rd", customers.get(695).getAddress());
	}

	@Test
	@DisplayName("Record 696: City is Fairfield")
	void CityOfRecord696() {
		assertEquals("Fairfield", customers.get(695).getCity());
	}

	@Test
	@DisplayName("Record 696: County is Essex")
	void CountyOfRecord696() {
		assertEquals("Essex", customers.get(695).getCounty());
	}

	@Test
	@DisplayName("Record 696: State is NJ")
	void StateOfRecord696() {
		assertEquals("NJ", customers.get(695).getState());
	}

	@Test
	@DisplayName("Record 696: ZIP is 7004")
	void ZIPOfRecord696() {
		assertEquals("7004", customers.get(695).getZIP());
	}

	@Test
	@DisplayName("Record 696: Phone is 973-575-5722")
	void PhoneOfRecord696() {
		assertEquals("973-575-5722", customers.get(695).getPhone());
	}

	@Test
	@DisplayName("Record 696: Fax is 973-575-5143")
	void FaxOfRecord696() {
		assertEquals("973-575-5143", customers.get(695).getFax());
	}

	@Test
	@DisplayName("Record 696: Email is annetta@rugga.com")
	void EmailOfRecord696() {
		assertEquals("annetta@rugga.com", customers.get(695).getEmail());
	}

	@Test
	@DisplayName("Record 696: Web is http://www.annettarugga.com")
	void WebOfRecord696() {
		assertEquals("http://www.annettarugga.com", customers.get(695).getWeb());
	}
}
