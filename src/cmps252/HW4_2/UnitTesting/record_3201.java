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

@Tag("33")
class Record_3201 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3201: FirstName is Libby")
	void FirstNameOfRecord3201() {
		assertEquals("Libby", customers.get(3200).getFirstName());
	}

	@Test
	@DisplayName("Record 3201: LastName is Rombs")
	void LastNameOfRecord3201() {
		assertEquals("Rombs", customers.get(3200).getLastName());
	}

	@Test
	@DisplayName("Record 3201: Company is Australian Body Works")
	void CompanyOfRecord3201() {
		assertEquals("Australian Body Works", customers.get(3200).getCompany());
	}

	@Test
	@DisplayName("Record 3201: Address is 150 S 5th St  #-3100")
	void AddressOfRecord3201() {
		assertEquals("150 S 5th St  #-3100", customers.get(3200).getAddress());
	}

	@Test
	@DisplayName("Record 3201: City is Minneapolis")
	void CityOfRecord3201() {
		assertEquals("Minneapolis", customers.get(3200).getCity());
	}

	@Test
	@DisplayName("Record 3201: County is Hennepin")
	void CountyOfRecord3201() {
		assertEquals("Hennepin", customers.get(3200).getCounty());
	}

	@Test
	@DisplayName("Record 3201: State is MN")
	void StateOfRecord3201() {
		assertEquals("MN", customers.get(3200).getState());
	}

	@Test
	@DisplayName("Record 3201: ZIP is 55402")
	void ZIPOfRecord3201() {
		assertEquals("55402", customers.get(3200).getZIP());
	}

	@Test
	@DisplayName("Record 3201: Phone is 612-349-4327")
	void PhoneOfRecord3201() {
		assertEquals("612-349-4327", customers.get(3200).getPhone());
	}

	@Test
	@DisplayName("Record 3201: Fax is 612-349-8685")
	void FaxOfRecord3201() {
		assertEquals("612-349-8685", customers.get(3200).getFax());
	}

	@Test
	@DisplayName("Record 3201: Email is libby@rombs.com")
	void EmailOfRecord3201() {
		assertEquals("libby@rombs.com", customers.get(3200).getEmail());
	}

	@Test
	@DisplayName("Record 3201: Web is http://www.libbyrombs.com")
	void WebOfRecord3201() {
		assertEquals("http://www.libbyrombs.com", customers.get(3200).getWeb());
	}
}
