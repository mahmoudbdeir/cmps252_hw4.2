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

@Tag("41")
class Record_4750 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4750: FirstName is Hai")
	void FirstNameOfRecord4750() {
		assertEquals("Hai", customers.get(4749).getFirstName());
	}

	@Test
	@DisplayName("Record 4750: LastName is Kurelko")
	void LastNameOfRecord4750() {
		assertEquals("Kurelko", customers.get(4749).getLastName());
	}

	@Test
	@DisplayName("Record 4750: Company is Just For Laughs")
	void CompanyOfRecord4750() {
		assertEquals("Just For Laughs", customers.get(4749).getCompany());
	}

	@Test
	@DisplayName("Record 4750: Address is 200 Saville Ave")
	void AddressOfRecord4750() {
		assertEquals("200 Saville Ave", customers.get(4749).getAddress());
	}

	@Test
	@DisplayName("Record 4750: City is Crum Lynne")
	void CityOfRecord4750() {
		assertEquals("Crum Lynne", customers.get(4749).getCity());
	}

	@Test
	@DisplayName("Record 4750: County is Delaware")
	void CountyOfRecord4750() {
		assertEquals("Delaware", customers.get(4749).getCounty());
	}

	@Test
	@DisplayName("Record 4750: State is PA")
	void StateOfRecord4750() {
		assertEquals("PA", customers.get(4749).getState());
	}

	@Test
	@DisplayName("Record 4750: ZIP is 19022")
	void ZIPOfRecord4750() {
		assertEquals("19022", customers.get(4749).getZIP());
	}

	@Test
	@DisplayName("Record 4750: Phone is 610-874-7455")
	void PhoneOfRecord4750() {
		assertEquals("610-874-7455", customers.get(4749).getPhone());
	}

	@Test
	@DisplayName("Record 4750: Fax is 610-874-7287")
	void FaxOfRecord4750() {
		assertEquals("610-874-7287", customers.get(4749).getFax());
	}

	@Test
	@DisplayName("Record 4750: Email is hai@kurelko.com")
	void EmailOfRecord4750() {
		assertEquals("hai@kurelko.com", customers.get(4749).getEmail());
	}

	@Test
	@DisplayName("Record 4750: Web is http://www.haikurelko.com")
	void WebOfRecord4750() {
		assertEquals("http://www.haikurelko.com", customers.get(4749).getWeb());
	}
}
