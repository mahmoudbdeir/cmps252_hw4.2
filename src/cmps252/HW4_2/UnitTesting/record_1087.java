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

@Tag("18")
class Record_1087 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1087: FirstName is Luke")
	void FirstNameOfRecord1087() {
		assertEquals("Luke", customers.get(1086).getFirstName());
	}

	@Test
	@DisplayName("Record 1087: LastName is Preseren")
	void LastNameOfRecord1087() {
		assertEquals("Preseren", customers.get(1086).getLastName());
	}

	@Test
	@DisplayName("Record 1087: Company is French Antique Shop Inc")
	void CompanyOfRecord1087() {
		assertEquals("French Antique Shop Inc", customers.get(1086).getCompany());
	}

	@Test
	@DisplayName("Record 1087: Address is Box #-117")
	void AddressOfRecord1087() {
		assertEquals("Box #-117", customers.get(1086).getAddress());
	}

	@Test
	@DisplayName("Record 1087: City is Vashon")
	void CityOfRecord1087() {
		assertEquals("Vashon", customers.get(1086).getCity());
	}

	@Test
	@DisplayName("Record 1087: County is King")
	void CountyOfRecord1087() {
		assertEquals("King", customers.get(1086).getCounty());
	}

	@Test
	@DisplayName("Record 1087: State is WA")
	void StateOfRecord1087() {
		assertEquals("WA", customers.get(1086).getState());
	}

	@Test
	@DisplayName("Record 1087: ZIP is 98070")
	void ZIPOfRecord1087() {
		assertEquals("98070", customers.get(1086).getZIP());
	}

	@Test
	@DisplayName("Record 1087: Phone is 206-463-7503")
	void PhoneOfRecord1087() {
		assertEquals("206-463-7503", customers.get(1086).getPhone());
	}

	@Test
	@DisplayName("Record 1087: Fax is 206-463-9553")
	void FaxOfRecord1087() {
		assertEquals("206-463-9553", customers.get(1086).getFax());
	}

	@Test
	@DisplayName("Record 1087: Email is luke@preseren.com")
	void EmailOfRecord1087() {
		assertEquals("luke@preseren.com", customers.get(1086).getEmail());
	}

	@Test
	@DisplayName("Record 1087: Web is http://www.lukepreseren.com")
	void WebOfRecord1087() {
		assertEquals("http://www.lukepreseren.com", customers.get(1086).getWeb());
	}
}
