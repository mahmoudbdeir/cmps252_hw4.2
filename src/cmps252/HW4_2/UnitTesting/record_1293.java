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

@Tag("21")
class Record_1293 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1293: FirstName is Felton")
	void FirstNameOfRecord1293() {
		assertEquals("Felton", customers.get(1292).getFirstName());
	}

	@Test
	@DisplayName("Record 1293: LastName is Bovie")
	void LastNameOfRecord1293() {
		assertEquals("Bovie", customers.get(1292).getLastName());
	}

	@Test
	@DisplayName("Record 1293: Company is Marshalltown Community Theater")
	void CompanyOfRecord1293() {
		assertEquals("Marshalltown Community Theater", customers.get(1292).getCompany());
	}

	@Test
	@DisplayName("Record 1293: Address is 1720 General George Patton Dr")
	void AddressOfRecord1293() {
		assertEquals("1720 General George Patton Dr", customers.get(1292).getAddress());
	}

	@Test
	@DisplayName("Record 1293: City is Brentwood")
	void CityOfRecord1293() {
		assertEquals("Brentwood", customers.get(1292).getCity());
	}

	@Test
	@DisplayName("Record 1293: County is Williamson")
	void CountyOfRecord1293() {
		assertEquals("Williamson", customers.get(1292).getCounty());
	}

	@Test
	@DisplayName("Record 1293: State is TN")
	void StateOfRecord1293() {
		assertEquals("TN", customers.get(1292).getState());
	}

	@Test
	@DisplayName("Record 1293: ZIP is 37027")
	void ZIPOfRecord1293() {
		assertEquals("37027", customers.get(1292).getZIP());
	}

	@Test
	@DisplayName("Record 1293: Phone is 615-377-9295")
	void PhoneOfRecord1293() {
		assertEquals("615-377-9295", customers.get(1292).getPhone());
	}

	@Test
	@DisplayName("Record 1293: Fax is 615-377-1242")
	void FaxOfRecord1293() {
		assertEquals("615-377-1242", customers.get(1292).getFax());
	}

	@Test
	@DisplayName("Record 1293: Email is felton@bovie.com")
	void EmailOfRecord1293() {
		assertEquals("felton@bovie.com", customers.get(1292).getEmail());
	}

	@Test
	@DisplayName("Record 1293: Web is http://www.feltonbovie.com")
	void WebOfRecord1293() {
		assertEquals("http://www.feltonbovie.com", customers.get(1292).getWeb());
	}
}
