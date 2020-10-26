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

@Tag("30")
class Record_759 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 759: FirstName is Rico")
	void FirstNameOfRecord759() {
		assertEquals("Rico", customers.get(758).getFirstName());
	}

	@Test
	@DisplayName("Record 759: LastName is Quinoes")
	void LastNameOfRecord759() {
		assertEquals("Quinoes", customers.get(758).getLastName());
	}

	@Test
	@DisplayName("Record 759: Company is Images Custom Photography")
	void CompanyOfRecord759() {
		assertEquals("Images Custom Photography", customers.get(758).getCompany());
	}

	@Test
	@DisplayName("Record 759: Address is 100 E Montauk Hwy")
	void AddressOfRecord759() {
		assertEquals("100 E Montauk Hwy", customers.get(758).getAddress());
	}

	@Test
	@DisplayName("Record 759: City is Lindenhurst")
	void CityOfRecord759() {
		assertEquals("Lindenhurst", customers.get(758).getCity());
	}

	@Test
	@DisplayName("Record 759: County is Suffolk")
	void CountyOfRecord759() {
		assertEquals("Suffolk", customers.get(758).getCounty());
	}

	@Test
	@DisplayName("Record 759: State is NY")
	void StateOfRecord759() {
		assertEquals("NY", customers.get(758).getState());
	}

	@Test
	@DisplayName("Record 759: ZIP is 11757")
	void ZIPOfRecord759() {
		assertEquals("11757", customers.get(758).getZIP());
	}

	@Test
	@DisplayName("Record 759: Phone is 631-957-7500")
	void PhoneOfRecord759() {
		assertEquals("631-957-7500", customers.get(758).getPhone());
	}

	@Test
	@DisplayName("Record 759: Fax is 631-957-0315")
	void FaxOfRecord759() {
		assertEquals("631-957-0315", customers.get(758).getFax());
	}

	@Test
	@DisplayName("Record 759: Email is rico@quinoes.com")
	void EmailOfRecord759() {
		assertEquals("rico@quinoes.com", customers.get(758).getEmail());
	}

	@Test
	@DisplayName("Record 759: Web is http://www.ricoquinoes.com")
	void WebOfRecord759() {
		assertEquals("http://www.ricoquinoes.com", customers.get(758).getWeb());
	}
}
