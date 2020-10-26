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

@Tag("15")
class Record_1157 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1157: FirstName is Derek")
	void FirstNameOfRecord1157() {
		assertEquals("Derek", customers.get(1156).getFirstName());
	}

	@Test
	@DisplayName("Record 1157: LastName is Matelich")
	void LastNameOfRecord1157() {
		assertEquals("Matelich", customers.get(1156).getLastName());
	}

	@Test
	@DisplayName("Record 1157: Company is Spats, Russell A Esq")
	void CompanyOfRecord1157() {
		assertEquals("Spats, Russell A Esq", customers.get(1156).getCompany());
	}

	@Test
	@DisplayName("Record 1157: Address is 5700 W Touhy Ave")
	void AddressOfRecord1157() {
		assertEquals("5700 W Touhy Ave", customers.get(1156).getAddress());
	}

	@Test
	@DisplayName("Record 1157: City is Niles")
	void CityOfRecord1157() {
		assertEquals("Niles", customers.get(1156).getCity());
	}

	@Test
	@DisplayName("Record 1157: County is Cook")
	void CountyOfRecord1157() {
		assertEquals("Cook", customers.get(1156).getCounty());
	}

	@Test
	@DisplayName("Record 1157: State is IL")
	void StateOfRecord1157() {
		assertEquals("IL", customers.get(1156).getState());
	}

	@Test
	@DisplayName("Record 1157: ZIP is 60714")
	void ZIPOfRecord1157() {
		assertEquals("60714", customers.get(1156).getZIP());
	}

	@Test
	@DisplayName("Record 1157: Phone is 847-647-2040")
	void PhoneOfRecord1157() {
		assertEquals("847-647-2040", customers.get(1156).getPhone());
	}

	@Test
	@DisplayName("Record 1157: Fax is 847-647-1892")
	void FaxOfRecord1157() {
		assertEquals("847-647-1892", customers.get(1156).getFax());
	}

	@Test
	@DisplayName("Record 1157: Email is derek@matelich.com")
	void EmailOfRecord1157() {
		assertEquals("derek@matelich.com", customers.get(1156).getEmail());
	}

	@Test
	@DisplayName("Record 1157: Web is http://www.derekmatelich.com")
	void WebOfRecord1157() {
		assertEquals("http://www.derekmatelich.com", customers.get(1156).getWeb());
	}
}
