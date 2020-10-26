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

@Tag("17")
class Record_4227 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4227: FirstName is Rhett")
	void FirstNameOfRecord4227() {
		assertEquals("Rhett", customers.get(4226).getFirstName());
	}

	@Test
	@DisplayName("Record 4227: LastName is Maack")
	void LastNameOfRecord4227() {
		assertEquals("Maack", customers.get(4226).getLastName());
	}

	@Test
	@DisplayName("Record 4227: Company is Moriarty, James L Esq")
	void CompanyOfRecord4227() {
		assertEquals("Moriarty, James L Esq", customers.get(4226).getCompany());
	}

	@Test
	@DisplayName("Record 4227: Address is 200 Park Ave")
	void AddressOfRecord4227() {
		assertEquals("200 Park Ave", customers.get(4226).getAddress());
	}

	@Test
	@DisplayName("Record 4227: City is Rutherford")
	void CityOfRecord4227() {
		assertEquals("Rutherford", customers.get(4226).getCity());
	}

	@Test
	@DisplayName("Record 4227: County is Bergen")
	void CountyOfRecord4227() {
		assertEquals("Bergen", customers.get(4226).getCounty());
	}

	@Test
	@DisplayName("Record 4227: State is NJ")
	void StateOfRecord4227() {
		assertEquals("NJ", customers.get(4226).getState());
	}

	@Test
	@DisplayName("Record 4227: ZIP is 7070")
	void ZIPOfRecord4227() {
		assertEquals("7070", customers.get(4226).getZIP());
	}

	@Test
	@DisplayName("Record 4227: Phone is 201-933-9694")
	void PhoneOfRecord4227() {
		assertEquals("201-933-9694", customers.get(4226).getPhone());
	}

	@Test
	@DisplayName("Record 4227: Fax is 201-933-3628")
	void FaxOfRecord4227() {
		assertEquals("201-933-3628", customers.get(4226).getFax());
	}

	@Test
	@DisplayName("Record 4227: Email is rhett@maack.com")
	void EmailOfRecord4227() {
		assertEquals("rhett@maack.com", customers.get(4226).getEmail());
	}

	@Test
	@DisplayName("Record 4227: Web is http://www.rhettmaack.com")
	void WebOfRecord4227() {
		assertEquals("http://www.rhettmaack.com", customers.get(4226).getWeb());
	}
}
