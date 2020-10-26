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

@Tag("39")
class Record_1877 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1877: FirstName is Janel")
	void FirstNameOfRecord1877() {
		assertEquals("Janel", customers.get(1876).getFirstName());
	}

	@Test
	@DisplayName("Record 1877: LastName is Scopel")
	void LastNameOfRecord1877() {
		assertEquals("Scopel", customers.get(1876).getLastName());
	}

	@Test
	@DisplayName("Record 1877: Company is Limattan Corp")
	void CompanyOfRecord1877() {
		assertEquals("Limattan Corp", customers.get(1876).getCompany());
	}

	@Test
	@DisplayName("Record 1877: Address is 200 York St")
	void AddressOfRecord1877() {
		assertEquals("200 York St", customers.get(1876).getAddress());
	}

	@Test
	@DisplayName("Record 1877: City is Louisville")
	void CityOfRecord1877() {
		assertEquals("Louisville", customers.get(1876).getCity());
	}

	@Test
	@DisplayName("Record 1877: County is Jefferson")
	void CountyOfRecord1877() {
		assertEquals("Jefferson", customers.get(1876).getCounty());
	}

	@Test
	@DisplayName("Record 1877: State is KY")
	void StateOfRecord1877() {
		assertEquals("KY", customers.get(1876).getState());
	}

	@Test
	@DisplayName("Record 1877: ZIP is 40203")
	void ZIPOfRecord1877() {
		assertEquals("40203", customers.get(1876).getZIP());
	}

	@Test
	@DisplayName("Record 1877: Phone is 502-581-8456")
	void PhoneOfRecord1877() {
		assertEquals("502-581-8456", customers.get(1876).getPhone());
	}

	@Test
	@DisplayName("Record 1877: Fax is 502-581-6246")
	void FaxOfRecord1877() {
		assertEquals("502-581-6246", customers.get(1876).getFax());
	}

	@Test
	@DisplayName("Record 1877: Email is janel@scopel.com")
	void EmailOfRecord1877() {
		assertEquals("janel@scopel.com", customers.get(1876).getEmail());
	}

	@Test
	@DisplayName("Record 1877: Web is http://www.janelscopel.com")
	void WebOfRecord1877() {
		assertEquals("http://www.janelscopel.com", customers.get(1876).getWeb());
	}
}
